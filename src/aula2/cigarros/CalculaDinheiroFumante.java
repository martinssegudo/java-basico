package aula2.cigarros;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * Calcular a quantidade dinheiro gasta por um fumante. Dados: o número de anos que ele
 * fuma, o nº de cigarros fumados por dia e o preço de uma carteira. 
 * 
 * @author Luiz Segundo
 *
 */
public class CalculaDinheiroFumante {

	/**
	 * 
	 * 1 - Ler o numero de anos que a pessoa fuma (1 ano = 365 dias) 
	 * 2 - Ler o numero de cigarros fumados por dia
	 * 3 - Ler o preço da carteira (1 carteira = 20 cigarros)
	 * 
	 * 4 - Calcua dinheiro gasto
	 * 
	 * 5 - Exibir resultado do calculo
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Digitre a quantidade de anos qeu vc fuma: ");
		int anosFumando = sc.nextInt();
		
		System.out.print("Digitre a quantidade de cigarros fumados por dia: ");
		int cigarrosFumadosPorDia = sc.nextInt();
		
		System.out.print("Digitre o valor da carteira de cigarro: ");
		double valorDaCarteiraDeCigarros = sc.nextDouble();
		
		int quantidadeCigarrosFumados = (anosFumando*365)*cigarrosFumadosPorDia;
		
		double quantidadeDeCaterirasFumadas = quantidadeCigarrosFumados/20;
		
		double valorGastoAteHojeComCigarros = quantidadeDeCaterirasFumadas*valorDaCarteiraDeCigarros;
		
		
		System.out.println("O valor gasto em cigarros até o momento é de: "+ valorGastoAteHojeComCigarros);
		
		
	}
}
