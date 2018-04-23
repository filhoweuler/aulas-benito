package academico.ui;
import javax.swing.JOptionPane;

import academico.dominio.cursos.CursoDisciplina;
import academico.dominio.pessoas.Aluno;

public class SimpleTest {
    public static void main(String[] args) {
        String nome; String curso; int matricula;
       
        nome = JOptionPane.showInputDialog("Entre com seu nome:");
        curso = JOptionPane.showInputDialog("Entre com seu curso");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Entre com seu curso"));
        
        CursoDisciplina cd = new CursoDisciplina(curso);
        Aluno a = new Aluno(nome, cd, matricula);
       
    }
}