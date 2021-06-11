package academy.devdojo.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/rodrigo");
        Path clazz = Paths.get("/home/rodrigo/devdojo/OlaMundo.java");
        Path pathClazz = dir.relativize(clazz);
        System.out.println(pathClazz);

        Path absoluto1 = Paths.get("/home/rodrigo");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/rodrigo/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("/temp");
        Path relativo2 = Paths.get("/temp/temp.2021921");


        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
        System.out.println("5 "+absoluto1.relativize(relativo1));
    }
}
