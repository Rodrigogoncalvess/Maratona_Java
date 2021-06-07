package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        CriandoNovoArquivo();
    }

    private static void CriandoNovoArquivo() {
        File file = new File("arquivo\\ teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
