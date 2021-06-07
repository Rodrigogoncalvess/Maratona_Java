package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Pessoa;



public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
