package academy.devdojo.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
             throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException()throws SQLException, FileNotFoundException {

    }
}



