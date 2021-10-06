package lacos.somador;

import java.util.Scanner;

/**
 * 
 * Faça um programa que leia vários inteiros positivos e mostre, no final, a soma dos
 * números pares e a soma dos números ímpares. O programa para quando entrar um número
 * maior que 1000.
 * 
 * @author simoe
 *
 */
public class LerSomar {
	
	/**
	 * 
	 * repetia
	 * 	1 - Ler um numero
	 * 	2 - Verificar se é par ou impar
	 * 	3 - Soma no par se o numero é par
	 * 	4 - Soma no impar se o numero é impar
	 * enquanto(numero lido < 1000)
	 * 
	 * final -  exibe o resultado das somas
	 * 
	 * @param args
	 */

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int numeroLido = 0;
		int somaPar = 0;
		int somaImpar = 0;
		
		do{
			System.out.print("Digite um número:");
			numeroLido = sc.nextInt();
			
			if(numeroLido%2==0) {
				somaPar += numeroLido;
			}else {
				somaImpar += numeroLido;
			}
			
		}while(numeroLido <= 1000);
		
		
		System.out.println("Soma dos pares: "+somaPar);
		System.out.println("Soma dos impares: "+somaImpar);
	}
}
