package aula2.cigarros.oo;

public class Main {

	public static void main(String [] args) {
		
		LeitorDados leitorDados = new LeitorDados(); 				
		int anosFumando = leitorDados.lerInteiro("Digite a quantidade de anos qeu vc fuma: ");		
		int cigarrosFumadosPorDia = leitorDados.lerInteiro("Digite a quantidade de cigarros fumados por dia: ");		
		double valorDaCarteiraDeCigarros = leitorDados.lerDouble("Digite o valor da carteira de cigarro: ");
		
		
		
		Calculadora calculadoraCigarros = new Calculadora();		
		int quantidadeDiasFumados = calculadoraCigarros.calculaDiasFumados(anosFumando);		
		int quantidadeCigarrosFumados = calculadoraCigarros.calculaQuantidadeDeCigarrosFumados(quantidadeDiasFumados, cigarrosFumadosPorDia);		
		double quantidadeDeCaterirasFumadas = calculadoraCigarros.calculaQuantidadeDeCarteirasFumadas(quantidadeCigarrosFumados, 20);		
		double valorGastoAteHojeComCigarros = calculadoraCigarros.calculaQuantidadeDeDinheiroGastoComCigarros(valorDaCarteiraDeCigarros, quantidadeDeCaterirasFumadas);
		
		
		System.out.println("O valor gasto em cigarros até o momento é de: "+ valorGastoAteHojeComCigarros);
	}
}
