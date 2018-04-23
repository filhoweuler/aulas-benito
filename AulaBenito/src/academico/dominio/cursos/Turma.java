package academico.dominio.cursos;

import java.util.Vector;
import academico.dominio.pessoas.*;
import academico.dominio.matriculas.*;

public class Turma {
	
		int periodo;
		Professor prof;
		Vector<Aluno> listaAluno = new Vector<Aluno>();
		Disciplina disc;
		
		Turma(int periodo, Professor prof, Disciplina disc){
			this.periodo = periodo;
			this.prof = prof;
			this.disc = disc;
			prof.adicionarDisciplina(disc);
		}
		
		void matricular(Aluno a) {
			listaAluno.add(a);
			a.h.matriculaDisciplina(disc);
		}
		
		void finalizarTurma() {
			for(Aluno a : listaAluno) {
				for(Matricula m : a.h.listaDisciplinas) {
					if(m.disc == disc) {
						if(m.nota >= 60) {
							m.situacao = SituacaoDisciplina.APROVADO;
						} else {
							m.situacao = SituacaoDisciplina.REPROVADO;
						}
					}
				}
			}
			prof.removerDisciplina(disc);
		}
}


