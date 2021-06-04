package academy.devdojo.maratonajava.javacore.classesabstratas.test;

import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Desenvolverdor;
import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolverdor desenvolverdor = new Desenvolverdor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolverdor);

        desenvolverdor.imprime();
        gerente.imprime();

    }
}
