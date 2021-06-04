package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno(" luffy ", 17);

        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("onde achar o one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
