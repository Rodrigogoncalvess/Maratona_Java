package academy.devdojo.maratonajava.javacore.data.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        Date date = new Date(1623164182694L);
        date.setTime(date.getTime()+3_600_000);// Acrescenta 1 hora à mais
        System.out.println(date);

    }
}
