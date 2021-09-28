package exemplo.oo;

import java.util.Scanner;

public class LeitorNota {

	public double lerNota(String menssagemExibicao) {
		Scanner sc = new Scanner(System.in);
		System.out.println(menssagemExibicao);
		double nota = sc.nextDouble();
		return nota;
	}
}
