package lacos.exemploOO;

import java.util.List;

public class Aluno {

	private String nome;
	private List<Presenca> presencas;
	
	public Aluno(String nome, List<Presenca> presencas) {		
		this.nome = nome;
		this.presencas = presencas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Presenca> getPresencas() {
		return presencas;
	}
	public void setPresencas(List<Presenca> presencas) {
		this.presencas = presencas;
	}
	
	
}
