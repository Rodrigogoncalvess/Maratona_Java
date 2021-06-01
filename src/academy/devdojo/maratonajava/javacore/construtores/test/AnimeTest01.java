package academy.devdojo.maratonajava.javacore.construtores.test;


import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive","TV",12,"Ação");
        Anime anime1 = new Anime();
        anime.imprime();
        anime1.imprime();

    }
}
