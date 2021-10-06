package lacos.somador.oo;

import java.util.Scanner;

public class LeitorDados {
	private Scanner sc;
	
	public LeitorDados() {
		this.sc = new Scanner(System.in);
	}
	
	public int lerInteiro(String mensagemExibicao) {		
		System.out.print(mensagemExibicao);
		return sc.nextInt();
	}
}
