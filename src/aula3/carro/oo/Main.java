package aula3.carro.oo;

public class Main {

	
	public static void main(String [] args) {
		CalculadorCarro calculadorCarro = new CalculadorCarro();
		ExbirdorResultado exbirResultado = new ExbirdorResultado();
		Leitor leitor = new Leitor();
		
		double valorFabrica = leitor.lerValor("Digite o valor de fabrica do veiculo: ");
		
		exbirResultado.exibeResultado("Valor final do carro: ", calculadorCarro.calculaValorFinalVeiculo(valorFabrica, 0.45, 0.12));
		exbirResultado.exibeResultado("Impostos sobre o valor: ", calculadorCarro.calculaImposto(valorFabrica, 0.45));
		exbirResultado.exibeResultado("Lucro vendedor: ", calculadorCarro.calculaLucro(valorFabrica, 0.12));
	}
}
