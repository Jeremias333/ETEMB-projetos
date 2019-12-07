package com.utils.enums;

public enum EnumLivro {
	ADC("Auto da Compadecida"),
	BRAS("Mem�ria P�stumas de Bras Cubas"),
	CORT("O Corti�o");
	
	private String livros;
	
	private EnumLivro(String livros) {
		this.livros = livros;
	}
	
	@Override
	public String toString() {
		return livros;
	}
}
