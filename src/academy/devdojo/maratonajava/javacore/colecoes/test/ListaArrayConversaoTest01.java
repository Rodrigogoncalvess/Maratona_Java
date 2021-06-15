package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] nnumerosArray = new Integer[3];
        nnumerosArray[0] = 1;
        nnumerosArray[1] = 2;
        nnumerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(nnumerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(nnumerosArray));
        System.out.println(arrayToList);

        System.out.println("-----------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(nnumerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<String> strings = Arrays.asList("1","2");
        List.of("1", "2");

    }
}
