package com.classes;

public class Usuario {
	
	private short id;
	private String user;
	private String password;
	private String tipoConta;
	private int pontosTotal;
	
	
	public int getPontosTotal() {
		return pontosTotal;
	}

	public void setPontosTotal(int pontosTotal) {
		this.pontosTotal = pontosTotal;
	}

	public short getId() {
		return id;
	}
	
	public void setId(short id) {
		this.id = id;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	
}
