package academy.devdojo.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double 0
        //char '\u0000' ' '
        // boolean false
        // string null

        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

    }
}
