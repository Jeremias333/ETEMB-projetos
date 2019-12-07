package com.classes;

public class Rank {
	private int lugar;
	private String nome;
	private int pontuacao;
	
	public Rank(int lugar, String nome, int pontuacao) {
		this.lugar = lugar;
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	
	public int getLugar() {
		return lugar;
	}
	public void setLugar(int lugar) {
		this.lugar = lugar;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
}
