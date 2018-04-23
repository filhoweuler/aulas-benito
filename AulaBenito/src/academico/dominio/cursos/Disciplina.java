package academico.dominio.cursos;

import java.util.Vector;

public class Disciplina {
	private Vector<Disciplina> disciplinasPrerequisito = new Vector<Disciplina>();
	private String nome;
	
	public void setNome(String s) {
		nome = s;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Vector<Disciplina> getDisciplinasPrerequisito() {
		return disciplinasPrerequisito;
	}
	
	public Disciplina (String nome, CursoDisciplina cd) {
		this.nome = nome;
		cd.addDisciplina(this);
	 }
	
	void declaraRequisito(Disciplina d) {
		disciplinasPrerequisito.add(d);
	 }

}