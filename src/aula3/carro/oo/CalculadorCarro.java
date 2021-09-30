package aula3.carro.oo;

public class CalculadorCarro {
	
	public double calculaImposto(double valorFabrica, double valorPercentualImposto) {
		return valorFabrica*valorPercentualImposto;
	}
	
	public double calculaLucro(double valorFabrica, double valorPercentualLucro) {
		return valorFabrica*valorPercentualLucro;
	}
	
	public double calculaValorFinalVeiculo(double valorFabrica, double valorPercentualImposto, double valorPercentualLucro) {
		return valorFabrica+calculaImposto(valorFabrica, valorPercentualImposto)+calculaLucro(valorFabrica, valorPercentualLucro);
	}


}
