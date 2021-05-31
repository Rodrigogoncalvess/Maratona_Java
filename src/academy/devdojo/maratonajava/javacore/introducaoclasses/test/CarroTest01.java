package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Fusca bala";
        carro1.model = "Sport";
        carro1.year = 1969;

        carro2.name = "Mustang";
        carro2.model = "GT 500";
        carro2.year = 1968;

        System.out.println("\nCarro 1");
        System.out.println(carro1.name);
        System.out.println(carro1.model);
        System.out.println(carro1.year);

        System.out.println("\nCarro 2");
        System.out.println(carro2.name);
        System.out.println(carro2.model);
        System.out.println(carro2.year);



    }
}
