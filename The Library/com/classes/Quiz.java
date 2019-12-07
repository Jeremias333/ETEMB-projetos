package com.classes;

public class Quiz {
	private int numquest;
	
	private String titulo;
	
	private String pergunta;
	
	private char certa;
	
	private int perguntaAtual;
	
	
	
	public int getPerguntaAtual() {
		return perguntaAtual;
	}

	public void setPerguntaAtual(int perguntaAtual) {
		this.perguntaAtual = perguntaAtual;
	}

	public int getNumquest() {
		return numquest;
	}

	public void setNumquest(int numquest) {
		this.numquest = numquest;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public char getCerta() {
		return certa;
	}

	public void setCerta(char certa) {
		this.certa = certa;
	}
	
}
