package exemplo.oo;

import java.util.Scanner;

/**
 * 
 * 
 * Calcular a m�dia final dadas as notas das 3 provas e
 * produzir uma sa�da com a m�dia e a situa��o do aluno de acordo com o seguinte crit�rio:
 * m�dia >= 7, aprovado; 5 < m�dia < 7, recupera��o; m�dia < 5, reprovado.
 * 
 *  
 * @author simoe
 *
 */
public class Main {
	// Algoritimo seguido
	
	/**
	 * 
	 * 1 - Ler a primeira nota
	 * 2 - Ler a segunda nota
	 * 3 - Ler a terceira nota
	 * 
	 * 4 - Calcular a media
	 * 
	 * 6 - Verifdico se a media >= 7 e exibe: "Media :<media> APROVADO"
	 * 7 - Verifdico se a 5 < media < 7 e exibe: "Media :<media> RECUPERA��O"
	 * 8 - Verifdico se a 5 > media e exibe: "Media :<media> REPROVADO"
	 * 
	 */
	public static void main(String [] args) {
		
		LeitorNota leitorNota = new LeitorNota();				
		double nota1 = leitorNota.lerNota("Digite primeira nota: ");  		
		double nota2 = leitorNota.lerNota("Digite segunda nota: ");		
		double nota3 = leitorNota.lerNota("Digite terceira nota: ");
		
		CalculadorMedia calculadorMedia = new CalculadorMedia();
		double media = calculadorMedia.calcularAMediaTresNotas(nota1, nota2, nota3);
		
		ExbidorResultado exbidorResultado = new ExbidorResultado();		
		exbidorResultado.exibeResultadoMedia(media);
		
		
	}
}
