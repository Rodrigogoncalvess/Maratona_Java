package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculandoImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung", 5000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        CalculandoImposto.calcularImpostoComputador(computador);
        System.out.println("----------------------");
        CalculandoImposto.calcularImpostoTomate(tomate);
    }
}
