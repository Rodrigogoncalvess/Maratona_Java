package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada? " + isDirectoryCreated);
        File fileArquivoDirectory = new File(fileDirectory, "Arquivo.txt");
        boolean isFileCreated =  fileArquivoDirectory.createNewFile();
        System.out.println("Arquivo.txt criado? " + isFileCreated);

        File fileRenamed = new File("arduivo_renomeado.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado "+isRenamed);

        File directoryRenamed = new File("arduivo_renomeado.txt");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("arquivo.txt renomeado "+isDirectoryRenamed);

    }

}
