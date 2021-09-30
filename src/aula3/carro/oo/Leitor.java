package aula3.carro.oo;

import java.util.Scanner;

public class Leitor {

	private Scanner sc;
	
	public Leitor() {
		sc = new java.util.Scanner(System.in);
	}
	
	public double lerValor(String mensagem) {				
		System.out.print(mensagem);
		return sc.nextDouble();
	}
}
