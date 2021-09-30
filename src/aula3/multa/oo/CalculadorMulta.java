package aula3.multa.oo;

public class CalculadorMulta {
	
	CalculadorVelocidade calculadorVelocidade;
	ExibidorResultado exibidorResultado;
	
	public CalculadorMulta() {
		this.calculadorVelocidade = new CalculadorVelocidade();
		this.exibidorResultado = new ExibidorResultado();
	}

	
	public void calculaMulta(int velocidadeDaVia, int velocidadeDoVeiculo){
		int velocidadeCalculada = calculadorVelocidade.calculaVelocidadeComInteiros(velocidadeDaVia, velocidadeDoVeiculo);		
		
		if(velocidadeCalculada > 0) {
			if(velocidadeCalculada<=10) {
				exibidorResultado.exbirResultadoMulta(velocidadeDaVia, velocidadeDoVeiculo, "50,00");				
			}else if(velocidadeCalculada > 10 
					 && velocidadeCalculada <= 30) {
				exibidorResultado.exbirResultadoMulta(velocidadeDaVia, velocidadeDoVeiculo, "100,00");				
			}else {
				exibidorResultado.exbirResultadoMulta(velocidadeDaVia, velocidadeDoVeiculo, "200,00");				
			}			
		}
	}
}
