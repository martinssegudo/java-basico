package aula3.multa.oo;

public class ConversorNumerico {
	
	
	public int converterNegativoParaPositivo(int negativo) {
		if(negativo < 0) {
			return negativo*(-1);
		}		
		return negativo;
	}
	
	
	public double converterNegativoParaPositivo(double negativo) {
		if(negativo < 0) {
			return negativo*(-1);
		}		
		return negativo;
	}

}
