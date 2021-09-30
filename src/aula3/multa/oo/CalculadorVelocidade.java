package aula3.multa.oo;

public class CalculadorVelocidade {
	
	ConversorNumerico conversorNumerico;
	
	public CalculadorVelocidade() {
		conversorNumerico = new ConversorNumerico();
	}
	
	public int calculaVelocidadeComInteiros(int velocidadeDaVia, int velocidadeDoVeiculo) {
		return conversorNumerico.converterNegativoParaPositivo(velocidadeDaVia-velocidadeDoVeiculo);
	}
	
	
	public double calculaVelocidadeComDoubles(double velocidadeDaVia, double velocidadeDoVeiculo) {
		return conversorNumerico.converterNegativoParaPositivo(velocidadeDaVia-velocidadeDoVeiculo);
	}
		
}
