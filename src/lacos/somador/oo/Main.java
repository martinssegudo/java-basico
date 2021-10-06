package lacos.somador.oo;

import aula3.ValoresInteiros;

public class Main {
	
	public static void main(String [] args) {
		Calculador calculador = new Calculador();
		Exibidor exibidor = new Exibidor();
		LeitorDados leitor = new LeitorDados();
		VerificaPar par = new VerificaPar();
		int valorLido = 0;
		int somaPar = 0;
		int somaImpar = 0;
		do {			
			valorLido = leitor.lerInteiro("Digite um número: ");
			if(par.verificarPar(valorLido)) {
				somaPar = calculador.somaDoisNumeros(somaPar, valorLido);
			}else {
				somaImpar = calculador.somaDoisNumeros(somaImpar, valorLido);
			}			
		}while(valorLido <= 1000);
		
		exibidor.exibirResultadoNumero("Soma dos pares: ", somaPar);
		exibidor.exibirResultadoNumero("Soma dos impares: ", somaImpar);
	}

}
