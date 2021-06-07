package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculandoImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Realatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }

//    public static void calcularImpostoComputador (Computador computador){
//        System.out.println("Relatório de imposto computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador "+computador.getNome());
//        System.out.println("Valor "+computador.getValor());
//        System.out.println("Imposto a ser pago "+imposto);
//
//    }
//    public static void calcularImpostoTomate (Tomate tomate){
//        System.out.println("Relatório de imposto tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Computador "+tomate.getNome());
//        System.out.println("Valor "+tomate.getValor());
//        System.out.println("Imposto a ser pago "+imposto);
//
//    }
}
