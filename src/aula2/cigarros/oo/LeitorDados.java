package aula2.cigarros.oo;

import java.util.Scanner;

public class LeitorDados {

	Scanner sc;
	
	public LeitorDados() {
		sc = new java.util.Scanner(System.in);
	}
	
	
	public int lerInteiro(String valorExibicao) {		
		System.out.print(valorExibicao);
		return this.sc.nextInt();
	}
	
	
	public double lerDouble(String valorExibicao) {		
		System.out.print(valorExibicao);
		return this.sc.nextDouble();
	}
}
