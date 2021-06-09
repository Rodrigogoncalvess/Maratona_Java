package academy.devdojo.maratonajava.javacore.data.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1982, 04, 16, 10, 00);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Total de dias: "+ChronoUnit.DAYS.between(aniversario,now));
        System.out.println("Total de semanas: "+ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println("Total de meses: "+ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println("Total de anos: "+ChronoUnit.YEARS.between(aniversario,now));
    }
}
