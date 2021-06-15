package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack ont titan");
        mangas.add("Berserk");
        mangas.add("Hellssing ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        new Manga(null,null,0);

    }
}
