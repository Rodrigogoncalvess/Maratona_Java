package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculandoImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung", 5000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao tv = new Televisao("OAC ", 4500);
        CalculandoImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculandoImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculandoImposto.calcularImposto(tv);
    }
}
