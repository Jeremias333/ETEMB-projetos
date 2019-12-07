package com.classes;

public class Moto extends Veiculo{
	/*
	 * Instanciar o veiculo(Carro/Moto) antes de pegar o precoFinal da classe Preco;
	 * 
	 * 
	 */
	private String marcaEscolhida;
	public int marca;
	Veiculo vel = new Veiculo();
	
	public Moto(int marca) {
		
		escolherMarca(marca);
		vel.setVeiculoEscolhido(2);
	}

	private void escolherMarca(int marca) {
		if(marca == 1) {
			marcaEscolhida = "Shineray";
			marca = 1;
			precoLavagem = 3.50f;
		}else if(marca == 2) {
			marcaEscolhida = "Suzuki";
			marca = 2;
			precoLavagem = (4.90f);
		}else if(marca == 3) {
			marcaEscolhida = "Dafra";
			marca = 3;
			precoLavagem = (3.90f);
		}else if(marca == 4) {
			marcaEscolhida = "Yamaha";
			marca = 4;
			precoLavagem = (5.30f);
		}else if(marca == 5) {
			marcaEscolhida = "Honda";
			marca = 5;
			precoLavagem = (7.40f);
		}
	}

	public String getMarcaEscolhida() {
		return marcaEscolhida;
	}

	public void setMarcaEscolhida(String marcaEscolhida) {
		this.marcaEscolhida = marcaEscolhida;
	}

}
