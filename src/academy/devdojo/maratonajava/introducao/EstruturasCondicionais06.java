package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais06 {
    public static void main(String[] args) {

        byte day = 8;


        switch (day) {
            case 1:
            case 7:

                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}