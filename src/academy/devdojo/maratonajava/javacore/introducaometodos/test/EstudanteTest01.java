package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante1 =new Estudante();
        Estudante estudante2 =new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.name = "Midoriya";
        estudante1.age = 15;
        estudante1.sex = 'M';

        estudante2.name = "Sakura";
        estudante2.age = 16;
        estudante2.sex = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
