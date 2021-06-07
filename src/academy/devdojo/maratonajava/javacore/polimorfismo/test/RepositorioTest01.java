package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);

    }
}
