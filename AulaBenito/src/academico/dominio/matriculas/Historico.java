package academico.dominio.matriculas;

import java.util.Vector;

import academico.dominio.cursos.CursoDisciplina;
import academico.dominio.cursos.Disciplina;
import academico.dominio.pessoas.Aluno;

public class Historico {
	 Vector<Matricula> listaDisciplinas = new Vector<Matricula>();
	 CursoDisciplina cd;
	 Aluno aluno;

	 public Historico(Aluno a){
	 this.aluno = a;


	 }


	 void matriculaDisciplina (Disciplina d) {
		 Matricula m = new Matricula();
		 m.disc = d;
		 m.nota = 0.0f;
		 m.situacao = SituacaoDisciplina.CURSANDO;
		 listaDisciplinas.add(m);
	 }

	 void atualizaResultado (Disciplina d, float nota) {
		 for(Matricula z : listaDisciplinas) {
			 if(z.disc == d) {
				 z.nota = nota;
			 }
		 }

	 }

	public void imprime () {
		 System.out.println("Historico do Aluno");
		 for (Matricula z : listaDisciplinas)
			 z.imprime();
	 }
}