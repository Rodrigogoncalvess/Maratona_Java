package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculandoImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Samsung", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        tomate.setDataValidade("Data Validade: 11/06/2021");

        CalculandoImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculandoImposto.calcularImposto(produto);

    }
}
