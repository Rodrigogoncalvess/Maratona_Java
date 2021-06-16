package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));
        List<Barco>barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"),new Barco("Iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro= rentalServiceCarro.buscarObjetosDisponivel();
        System.out.println("Usando o carro por um mês");
        rentalServiceCarro.retornarObjetosAlugado(carro);

        System.out.println("_________________");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco= rentalServiceBarco.buscarObjetosDisponivel();
        System.out.println("Usando o carro por um mês");
        rentalServiceBarco.retornarObjetosAlugado(barco);

    }
}
