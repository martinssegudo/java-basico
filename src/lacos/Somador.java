package lacos;

/**
 * 
 * Faça um programa que calcula e escreve a seguinte soma:
 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
 * 
 * @author simoe
 *
 */
public class Somador {
	
	public static void main(String [] args) {
		double somatorio = 0;
		int numeroCima = 1;
		for (int i = 1; i <= 50; i++) {
			System.out.print(numeroCima+"/"+i);
			if(i != 50) {
				System.out.print(" + ");
			}
			somatorio += numeroCima/i;			
			numeroCima += 2;			
		}
	}
}
