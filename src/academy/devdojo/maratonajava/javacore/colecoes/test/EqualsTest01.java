package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("1ABC1","Iphone");
        System.out.println(s1.equals(s2));

//        String nome = "William Suane";
//        String nome2 = new String("William Suane");
//        System.out.println(nome.equals(nome2));
    }
}
