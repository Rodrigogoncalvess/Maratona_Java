package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O melhor curso \n Continua muito bom ");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
