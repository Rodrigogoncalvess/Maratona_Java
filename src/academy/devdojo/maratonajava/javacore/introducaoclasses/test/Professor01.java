package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class Professor01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.sex = 'M';

        System.out.println("Nome: "+professor.name +" Idade: "+professor.age +" Sexo: "+professor.sex);

    }
}
