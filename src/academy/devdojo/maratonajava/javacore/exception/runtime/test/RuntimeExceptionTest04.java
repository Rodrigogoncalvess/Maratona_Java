package academy.devdojo.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException");

        } catch (RuntimeException e) {
            System.out.println("Dentro RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}



