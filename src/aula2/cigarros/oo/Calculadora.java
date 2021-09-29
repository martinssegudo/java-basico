package aula2.cigarros.oo;

public class Calculadora {
	
	public int calculaDiasFumados(int quantidadeDeAnosFumados) {
		return quantidadeDeAnosFumados*365;
	}
	
	public int calculaQuantidadeDeCigarrosFumados(int quantidadeDeDiasFumados, 
												  int quantidadeDecigarrosFumadosPorDia) {
		return quantidadeDeDiasFumados*quantidadeDecigarrosFumadosPorDia;
	}
	
	public double calculaQuantidadeDeCarteirasFumadas(int quantidadeDeCigarrosFumados,
													  int quantidadeDeCigarrosEmUmaCarteira) {
		return quantidadeDeCigarrosFumados/quantidadeDeCigarrosEmUmaCarteira;
	}
	
	public double calculaQuantidadeDeDinheiroGastoComCigarros(double valorDaCarteria, 
														      double quantidadeDeCarteirasFumadas) {
		return valorDaCarteria*quantidadeDeCarteirasFumadas;		
	}
	
}
