package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result =  calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,5));
        calculadora.imprimeDivisaoDeDoisNumeros(86,5);


    }
}
