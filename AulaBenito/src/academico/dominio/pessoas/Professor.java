package academico.dominio.pessoas;

import java.util.Vector;
import academico.dominio.cursos.Disciplina;

public class Professor {
	private String nome;
	private int id;
	
	private Vector<Disciplina> disciplinasAulaAtuais = new Vector<Disciplina>();
	
	public Professor(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public void adicionarDisciplina(Disciplina d) {
		disciplinasAulaAtuais.add(d);
	}
	
	public void removerDisciplina(Disciplina d) {
		disciplinasAulaAtuais.remove(d);
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	void ministrando(){
	
		System.out.println("Informacoes do ministrante:");
		System.out.println("Nome: " +nome);
		System.out.println("ID: " +id);
		for(Disciplina z: disciplinasAulaAtuais)
			System.out.println("Ministrando: " +z.getNome());
	
	}

}