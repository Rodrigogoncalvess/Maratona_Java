package academy.devdojo.maratonajava.javacore.generics.service;

import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetosDisponivel() {
        System.out.println("Buscando objeto disponivel... ");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objetos: " + t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetosAlugado(T t) {
        System.out.println("Devolvendo carro: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
