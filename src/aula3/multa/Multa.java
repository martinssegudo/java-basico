package aula3.multa;

import java.util.Scanner;

/**
 * 
 * Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista
 * estava dirigindo nela e calcule a multa que uma pessoa vai receber, sabendo que são
 * pagos: a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
 * (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h); b) 100 reais, se o
 * motorista ultrapassar de 11 a 30 km/h a velocidade permitida. c) 200 reais, se estiver
 * acima de 31km/h da velocidade permitida. 
 * 
 * @author Luiz Segundo
 *
 */
public class Multa {
	
	/**
	 * 
	 * 1 - Ler a velolcidade maxima permitida
	 * 2 - Ler a velocidade do veiculo
	 * 
	 * 3 - Calcular a diferença da velocidade permitida para a velocidade do veiculo
	 * 
	 *  4 - calcular a multa
	 *  5 - Exeibir o resultado
	 * 
	 */
	
	public static void main(String [] args) {
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Digite a velocidade permita na via: ");
		int velocidadePermitida = sc.nextInt();
		
		System.out.print("Digite a velocidade do veiculo: ");
		int velocidadeDoVeiculo = sc.nextInt();
		
		
		int velocidadeCalculada =  (velocidadePermitida - velocidadeDoVeiculo)*(-1);
		
		if(velocidadeCalculada > 0) {
			if(velocidadeCalculada<=10) {
				System.out.println("Voce esta dirigindo a : "+velocidadeDoVeiculo+" em uma via de "+velocidadePermitida);
				System.out.println("Multa de 50,00 R$");
			}else if(velocidadeCalculada > 10 
					 && velocidadeCalculada <= 30) {
				System.out.println("Voce esta dirigindo a : "+velocidadeDoVeiculo+" em uma via de "+velocidadePermitida);
				System.out.println("Multa de 100,00 R$");
			}else {
				System.out.println("Voce esta dirigindo a : "+velocidadeDoVeiculo+" em uma via de "+velocidadePermitida);
				System.out.println("Multa de 200,00 R$");
			}			
		}				
	}

}
