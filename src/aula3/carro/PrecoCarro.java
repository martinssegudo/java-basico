package aula3.carro;

import java.util.Scanner;

/**
 * 
 * Que gere o preço de um carro ao consumidor e os valores pagos pelo imposto e pelo lucro
 * do distribuidor, sabendo o custo de fábrica do carro e que são pagos: a) de imposto: 45%
 * sobre o custo do carro; b) de lucro do distribuidor: 12% sobre o custo do carro. 
 * 
 * @author Luiz Segundo
 *
 */
public class PrecoCarro {
	
	public static void main(String [] args) {
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Digite o valor de fabrica do veiculo: ");
		double valorDeFabrica = sc.nextDouble();
				
		double valorImposto= valorDeFabrica*0.45;
		double valorLucro=valorDeFabrica*0.12;
		
		double valorFinal=valorDeFabrica+valorImposto+valorLucro;
		
		System.out.println("Valor final do carro: "+valorFinal);
		System.out.println("Impostos sobre o valor: "+valorImposto);
		System.out.println("Lucro vendedor: "+valorLucro);
		
	}
}
