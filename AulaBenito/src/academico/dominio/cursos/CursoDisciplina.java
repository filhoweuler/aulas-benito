package academico.dominio.cursos;

import java.util.Vector;

public class CursoDisciplina {
	private Vector<Disciplina> Cdis = new Vector<Disciplina>();
	private String nome;
	
	public void setNome(String s) {
		nome = s;
	}
	
	public String getNome() {
		return nome;
	}
	
	public CursoDisciplina(String nome){
		this.nome = nome;
	}
	
	void addDisciplina(Disciplina d){
		Cdis.add(d);
	}
	
	void imprimecd(){
		System.out.println("Disciplinas do curso:");
		for(Disciplina d: Cdis)
			System.out.println(d.getNome());
	}
}