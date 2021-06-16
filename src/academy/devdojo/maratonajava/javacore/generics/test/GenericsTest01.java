package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));

        for (Object o : lista) {
            System.out.println(o);

        }
    }

    private static void add(List lista, Consumidor consumidor) {

    }

}

