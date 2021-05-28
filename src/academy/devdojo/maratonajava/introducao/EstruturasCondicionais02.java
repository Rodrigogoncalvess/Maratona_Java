package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {

        // age < 15 category childish
        // age >= 15 && < 18 category juvenile
        //age >= 18 category adult

        int age = 12;
        String category;


        if(age < 15){
            category = "Categoria Infantil ";
        }else if (age >= 15 && age < 18){
            category = "Juvenil";

        }else {
            category = "Categoria adulto";
        }
        System.out.println(category);
    }
}
