package com.utils;

public class Preco {
	private float precoFinal;
	/*
	 * Instanciar o veiculo(Carro/Moto) antes de pegar o precoFinal da classe Preco;
	 * 
	 * 
	 */
	
	/*
	 * Veiculo 1 = Carro
	 * Veiculo 2 = Moto
	 * 
	 * */
	
	public void lavagemSimples(float primeiroPreco, int veiculo) {
		if(veiculo == 1) {
			precoFinal = primeiroPreco + 15.00f;
		}
		if(veiculo == 2) {
			precoFinal = primeiroPreco + 7.00f;
		}
	}
	
	public void lavagemCompleta(float primeiroPreco, int veiculo) {
		if(veiculo == 1) {
			precoFinal = primeiroPreco + 25.00f;
		}
		if(veiculo == 2) {
			precoFinal = primeiroPreco + 10.00f;
		}
	}

	public float getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	
}
