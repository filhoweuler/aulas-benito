package academico.dominio.matriculas;

import academico.dominio.cursos.Disciplina;

public class Matricula {
	public Disciplina disc;
	public float nota;
	public SituacaoDisciplina situacao;
	
	void imprime() {
	 System.out.println(disc.getNome() + " - " + nota + ": " + situacao);
	} 
}