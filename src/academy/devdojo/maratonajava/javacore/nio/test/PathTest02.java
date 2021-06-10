package academy.devdojo.maratonajava.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDiretorio = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filaPath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filaPath)) {
            Path filePathCreated = Files.createDirectory(filaPath);
        }
        Path source = filaPath;
        Path    target  =   Paths.get(filaPath.getParent().toString(),"file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
