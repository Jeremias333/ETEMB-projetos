package com.utils.enums;

public enum EnumLivro {
	ADC("Auto da Compadecida"),
	BRAS("Memória Póstumas de Bras Cubas"),
	CORT("O Cortiço");
	
	private String livros;
	
	private EnumLivro(String livros) {
		this.livros = livros;
	}
	
	@Override
	public String toString() {
		return livros;
	}
}
