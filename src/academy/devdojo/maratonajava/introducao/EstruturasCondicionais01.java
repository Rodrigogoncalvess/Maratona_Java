package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyDink = age >= 18;

        // !
        if (isAuthorizedBuyDink) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        if (!isAuthorizedBuyDink) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora if");
    }

}
