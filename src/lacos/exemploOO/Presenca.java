package lacos.exemploOO;

public class Presenca {
	private String data;
	private boolean presenca;
	
	public Presenca(String data, boolean presenca) {
		this.data = data;
		this.presenca = presenca;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isPresenca() {
		return presenca;
	}
	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}
}
