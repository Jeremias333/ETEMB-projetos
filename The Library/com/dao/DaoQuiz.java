package com.dao;

import com.classes.Quiz;
import com.classes.Usuario;
import com.view.intern.InternTelaQuiz;

public class DaoQuiz extends ConnectFactory{
	
//	public static int quantidadeQuestoes;
	public static int questaoAtual;
	public static char resposta;
	public static int lingua; 
//	public static int inat;
	
	public static Usuario usuario = new Usuario();
	public static Quiz quiz = new Quiz();
	
	
	
	public DaoQuiz() {
		quiz.setPerguntaAtual(1);
	}
	
	public static String retornarQuestao(String tabela, String titulo, int questaoAtual) {
		String sqlQuestao = "select pergunta, certa from "+tabela+" where ((titulo = '"+titulo+"' ) and (numquest = '"+questaoAtual+"'));";
		
		try {
			
			stmt = con.createStatement();
			res = stmt.executeQuery(sqlQuestao);
			
			while(res.next()) {
				quiz.setPergunta(res.getString("pergunta"));
				quiz.setCerta((res.getString("certa").toUpperCase().charAt(0)));
				quiz.setPerguntaAtual(quiz.getPerguntaAtual()+1);
				
			}
//			quiz.setPerguntaAtual(quiz.getPerguntaAtual()+1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	public static String pegarTitulo(int titulo) {
		
		if(titulo == 1) {
			return "ADC";
		}else if(titulo == 2) {
			return "BRAS";
		}else if(titulo == 3) {
			return "OCORT";
		}
		
		return "";
	}
	
	public static String pegarLinguaTabela(int idioma) {
		
		if(idioma == 1) {
			return "quizbr";
		}else if(idioma == 2) {
			return "quizus";
		}else if(idioma == 3) {
			return "quizes";
		}
		
		return "";
	}
	
	@SuppressWarnings("unused")
	public static void confirmarResposta() {
		String sql = "";
		
		if(InternTelaQuiz.rdbtA.isSelected() && quiz.getCerta() == 'A') {
			DaoUsuario.setPontos(1, usuario.getUser());
		}else if(InternTelaQuiz.rdbtB.isSelected() && quiz.getCerta() == 'B') {
			DaoUsuario.setPontos(1, usuario.getUser());
		}else if(InternTelaQuiz.rdbtC.isSelected() && quiz.getCerta() == 'C') {
			DaoUsuario.setPontos(1, usuario.getUser());
		}else if(InternTelaQuiz.rdbtD.isSelected() && quiz.getCerta() == 'D') {
			DaoUsuario.setPontos(1, usuario.getUser());
		}
	}
	
	
}
