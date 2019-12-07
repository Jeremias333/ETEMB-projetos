package com.bancodedados;

import java.sql.SQLException;

import com.classes.Usuario;

public class DaoUsuario extends ConnectFactory {
	
	static ConnectFactory conexao;
	
	static boolean permissaoNick;
	static boolean permissaoSenha;
	
	static String nickBD;
	
	public static boolean procurarUsuario(String nick) {
		
		conexao = new ConnectFactory();
		
		String sql = "SELECT nick FROM usuario WHERE nick ='"+nick+"';";
		
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(res != null || res.next()) {
				while(res.next())
				nickBD = res.getString("nick");
				
				 if(nickBD == null) {
					return false;
				}else if(nickBD.equals(nick)) {
					return true;
				}
				
				
			}else {
				System.out.print("aqui");
				return false;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean verificarSenhaIguais(String senha, String reSenha) {
		
		if(senha.equals(reSenha)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean cadastrarUsuario(String nome, String nick, String senha, String reSenha) {
		conexao = new ConnectFactory();
		
		permissaoNick = procurarUsuario(nick);
		permissaoSenha = verificarSenhaIguais(senha, reSenha);
		
		System.out.println("Nick deve ser falso: "+permissaoNick);
		System.out.println("Nick : "+nickBD);
		System.out.println("Senha deve ser true: "+permissaoSenha);
		
		if(permissaoNick == false && permissaoSenha == true) {
			
			try {
				String sql = "INSERT INTO usuario (nome,nick,senha) VALUES ('"+nome+"','"+nick+"','"+senha+"');";
				
				stmt = con.createStatement();
				stmt.executeUpdate(sql);
				
				return true;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else {
			
			return false;
		}
		
		return false;
	}
	
	public static boolean loginUsuario(String nick, String senha) {
		conexao = new ConnectFactory();
		
		permissaoNick = procurarUsuario(nick);
		
		res = null;
		if(permissaoNick == true) {
			
			try {
				String sql = "SELECT senha FROM usuario WHERE nick ='"+nick+"';";
				
				stmt = con.createStatement();
				res = stmt.executeQuery(sql);
				
				
				while(res.next())
				if(senha.equals(res.getString("senha"))) {
					return true;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static String getNomeCompleto(String nick) {
		conexao = new ConnectFactory();
		String sql = "SELECT nome FROM usuario WHERE nick ='"+nick+"';";
		
		try {
			
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			
			while(res.next())
			return res.getString("nome");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Usuario popularPerfil(String nick) {
		conexao = new ConnectFactory();
		
		Usuario user = new Usuario();
		
		String sql = "SELECT id,nome,deve FROM usuario WHERE nick ='"+nick+"';";
		

		try {
			
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			
			while(res.next()) {
				user.setID(res.getInt("id"));
				user.setNome(res.getString("nome"));
				user.setDeve(res.getFloat("deve"));
			}
			
			return user;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	

}
