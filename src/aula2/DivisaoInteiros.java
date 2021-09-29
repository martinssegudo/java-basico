package aula2;

import java.util.Scanner;

/**
 * 
 * Ler 2 n�meros inteiros do teclado. Se o segundo for diferente de zero, calcular e imprimir
 * o quociente do primeiro pelo segundo. Caso contr�rio, imprimir a mensagem: �DIVIS�O
 * POR ZERO�. 
 * 
 * @author Luiz Segundo
 *
 */
public class DivisaoInteiros {

	/**
	 * 1 - Ler um inteiro
	 * 2 - Ler um inteiro
	 * 
	 * 3 - Checar se o segundo numero �  != ZERO
	 * 3.1 - Imprima o quociente da divis�o
	 * 3.2 - Imprima �DIVIS�O POR ZERO�
	 * 
	 */
	
	public static void main(String [] args) {
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		int primeiroNumeroDaDivisao = sc.nextInt();
		
		System.out.print("Digite um inteiro: ");
		int segundoNumeroDaDivisao = sc.nextInt();
		
		if(segundoNumeroDaDivisao != 0) {
			System.out.println(primeiroNumeroDaDivisao%segundoNumeroDaDivisao);
		}else {
			System.out.print("DIVIS�O POR ZERO");
		}
	}
}
