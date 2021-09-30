package aula3.multa.oo;

import java.util.Scanner;

public class LeitorDados {
	
	Scanner sc;
	
	public LeitorDados() {
		sc = new java.util.Scanner(System.in);
	}
	

	public int lerValorInteiro(String mensagem){
		System.out.print(mensagem);
		return sc.nextInt();		
	}
	
	
	public double lerValorDouble(String mensagem){
		System.out.print(mensagem);
		return sc.nextDouble();		
	}
}
