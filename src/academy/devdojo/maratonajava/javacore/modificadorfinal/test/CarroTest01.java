package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setComprador("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}