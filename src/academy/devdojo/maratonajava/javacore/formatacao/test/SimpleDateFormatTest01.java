package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "'Rio de Janeiro' dd 'de' MMMM 'de' yyyy ','E 'às' k':'m':'s a";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Rio de Janeiro 08 de junho de 2021 ,ter. às 15:43:9 PM"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
