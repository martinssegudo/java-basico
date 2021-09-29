package aula1.media.oo;

public class ExbidorResultado {

	/**
	 * 6 - Verifdico se a media >= 7 e exibe: "Media :<media> APROVADO" 7 -
	 * Verifdico se a 5 < media < 7 e exibe: "Media :<media> RECUPERAÇÃO" 8 -
	 * Verifdico se a 5 > media e exibe: "Media :<media> REPROVADO"
	 */
	public void exibeResultadoMedia(double media) {
		String resultado = "";
		if(media <= 5)
			resultado = "REPROVADO";
		if(media > 5 && media <7)
			resultado = "RECUPERAÇÃO";
		if(media >= 7)
			resultado = "APROVADO";
		
		escreveResultado(media, resultado);
	}
	
	private void escreveResultado(double media, String resultado) {
		System.out.println("Media :"+media+" "+resultado);
	}
}
