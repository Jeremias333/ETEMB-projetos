package com.classes;

public class Carro extends Veiculo{
	/*
	 * Instanciar o veiculo(Carro/Moto) antes de pegar o precoFinal da classe Preco;
	 * 
	 * 
	 */
	private String marcaEscolhida;
	public int marca;
	Veiculo vel = new Veiculo();
	
	public Carro(int marca) {
//		Q1uantidadeRodas(4);
		escolherMarca(marca);
		vel.setVeiculoEscolhido(1);
	}

	public void escolherMarca(int marca) {
		if(marca == 1) {
			marcaEscolhida = "Fiat";
			marca = 1;
			precoLavagem = 8.00f;
		}else if(marca == 2) {
			marcaEscolhida = "Volkswagen";
			marca = 2;
			precoLavagem = (5.90f);
		}else if(marca == 3) {
			marcaEscolhida = "Ford";
			marca = 3;
			precoLavagem = (7.00f);
		}else if(marca == 4) {
			marcaEscolhida = "Toyota";
			marca = 4;
			precoLavagem = (8.50f);
		}else if(marca == 5) {
			marcaEscolhida = "Sedã";
			marca = 5;
			precoLavagem = (10.00f);
		}
	}
	
	public String getMarcaEscolhida() {
		return marcaEscolhida;
	}

	public void setMarcaEscolhida(String marcaEscolhida) {
		this.marcaEscolhida = marcaEscolhida;
	}
	
	
}
