package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaço em branco \t \n \f \r
        // \S = Todos carcteres excluindo os brancos
        // \w = a-ZA-Z, digitos, -
        // \W = Tudo que não for incluso no \w
        // []
        // ? Zero ou mais
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[3].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posiçoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }


    }
}
