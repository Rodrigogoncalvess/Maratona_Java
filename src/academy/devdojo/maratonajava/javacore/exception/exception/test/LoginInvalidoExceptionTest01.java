package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "ssf";
        System.out.println("Usuário");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada) ){
            throw new LoginInvalidoException("Usuário ou senha inválida");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
