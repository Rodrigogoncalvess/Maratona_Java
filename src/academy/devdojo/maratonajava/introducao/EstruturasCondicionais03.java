package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {

        // Doar se salario > 5000
        double salary = 6000;
        //(condição) ? verdadeiro : falso
        String result = salary  > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(result);

    }
}
