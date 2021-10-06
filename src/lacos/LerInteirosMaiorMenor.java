package lacos;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que lê 15 valores reais, encontra o maior e o menor deles e
 * mostra o resultado.
 * 
 * @author simoe
 *
 */
public class LerInteirosMaiorMenor {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int maiorNumero = 0;
		int menorNumero = 1000000000;
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um numero: ");
			int numeroLido = sc.nextInt();
			if(numeroLido > maiorNumero) 
				maiorNumero = numeroLido;
			
			if(numeroLido < menorNumero)
				menorNumero = numeroLido;
		}
		
		System.out.println("Maior numero: "+maiorNumero);
		System.out.println("Menor numero: "+menorNumero);
	}
}
