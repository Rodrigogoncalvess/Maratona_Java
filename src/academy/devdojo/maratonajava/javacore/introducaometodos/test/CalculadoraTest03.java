package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result =  calculadora.dividirDoisNumeros(20,2);
        System.out.println(result);
    }
}
