package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoadTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }

}
