package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculandoImposto;

import javax.sound.midi.Soundbank;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Dell", 6000);
        System.out.println( produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());


        System.out.println("----------------------");

        Produto produto1 = new Tomate("Tomate americano", 15);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}
