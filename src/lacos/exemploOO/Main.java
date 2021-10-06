package lacos.exemploOO;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String [] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Presenca> presencas = new ArrayList<Presenca>();
		presencas.add(new Presenca("01/01/2021", true));
		presencas.add(new Presenca("02/01/2021", true));
		presencas.add(new Presenca("03/01/2021", false));
		alunos.add(new Aluno("Luiz", presencas));
		
		
		presencas = new ArrayList<Presenca>();
		presencas.add(new Presenca("01/01/2021", true));
		presencas.add(new Presenca("02/01/2021", false));
		presencas.add(new Presenca("04/01/2021", true));
		alunos.add(new Aluno("Isis", presencas));
		
		List<String> datas = new ArrayList<String>();
		for (Aluno aluno : alunos) {
			for (Presenca presenca : aluno.getPresencas()) {
				if(!datas.contains(presenca.getData()))
					datas.add(presenca.getData());
			}
		}
		
		int count = 0;
		for (String data : datas) {
			if(count == 0){
				System.out.print("Nome do aluno "+data+" ");
				count++;
			}else {
				System.out.print(data+" ");
			}
		}
		
		System.out.println();
		
		for (Aluno aluno : alunos) {
			System.out.print(aluno.getNome()+" ");
			for (String data : datas) {
				String presencaExibicao = "";
				for (Presenca presenca : aluno.getPresencas()) {
					if(presenca.getData().equals(data)) {
						presencaExibicao =(presenca.isPresenca())?"Presente":"Falta";
						break;
					}
					presencaExibicao ="Falta";
				}
				System.out.print(presencaExibicao+" ");
			}	
			System.out.println();
		}
		
		
	}
}
