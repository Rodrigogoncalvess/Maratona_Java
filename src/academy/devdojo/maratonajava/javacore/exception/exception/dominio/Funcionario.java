package academy.devdojo.maratonajava.javacore.exception.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar()throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionário");
    }
}
