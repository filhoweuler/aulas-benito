package academico.dominio.pessoas;

import java.util.Vector;

import academico.dominio.cursos.CursoDisciplina;
import academico.dominio.cursos.Disciplina;
import academico.dominio.cursos.Turma;
import academico.dominio.matriculas.Historico;
import academico.dominio.matriculas.Matricula;

public class Aluno {
	private String nome;
	private int matricula;
	CursoDisciplina curso;
	Historico h = new Historico(this);
	
	public Aluno (String nome, CursoDisciplina curso, int matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}
	
	void matriculadoDisciplina(Turma t){
		int pode = 0,naomatricula = 0;
		for(Disciplina d : t.disc.DisciplinasPrerequisito) {
			pode = 0;
			for(Matricula m : h.listaDisciplinas) {
				if(d == m.disc && m.situacao == SituacaoDisciplina.APROVADO) {
					pode = 1;
					System.out.println("Matriculado com sucesso na disciplina: " +d.nome);
				}
			}
			if(pode == 0) {
				System.out.println("Nao tem os requisito para cursar a disciplina, favor fazer antes a disciplina: "+d.nome);
				naomatricula = 1;
				break;
			}
		}
		if(naomatricula == 0) {
			//h.matriculaDisciplina(t.disc);
			t.matricular(this);
		}
	}
	
	void formou() {
		int formou=0;
		Vector<Disciplina> falta = new Vector<Disciplina>();
		for(Disciplina f: curso.Cdis) {
			for(Matricula a: h.listaDisciplinas)
				if(f == a.disc) {
					if(a.situacao != SituacaoDisciplina.APROVADO) {
						formou++;
						falta.add(a.disc);
					}
				}
		}
		if(formou == 0) {
			System.out.println("CONGRATSSS! GG");
		}
		else {
			System.out.println("Disciplinas restantes para formar");
			for(Disciplina p: falta)
				System.out.println("Falta disciplina: "+ p.nome);
		}
	}
	
	void imprime() {
		System.out.println("Nome:" + nome);
		System.out.println("Curso:" + curso.nome);
		System.out.println("matricula:" + matricula);
		System.out.println("-----------------------------");
		h.imprime();
	}
}