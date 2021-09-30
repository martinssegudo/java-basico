package aula3.multa.oo;

public class Main {
	public static void main(String [] args) {
		LeitorDados leitorDeDados = new LeitorDados();
		CalculadorMulta calculadorMulta = new CalculadorMulta();		
		
		int velocidadePermitida = leitorDeDados.lerValorInteiro("Digite a velocidade permita na via: ");
		int velocidadeDoVeiculo = leitorDeDados.lerValorInteiro("Digite a velocidade do veiculo: ");		
	 	calculadorMulta.calculaMulta(velocidadePermitida, velocidadeDoVeiculo);
	}
}
