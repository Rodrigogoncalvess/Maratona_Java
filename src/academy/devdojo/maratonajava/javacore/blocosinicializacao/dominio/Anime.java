package academy.devdojo.maratonajava.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //alocado espaço em memória pro projeto
    //Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    //Bloco de inicialização é executado
    //Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println(" ");


    }

        public String getNome () {
        return nome;
    }

        public int[] getEpisodios () {
        return episodios;
    }

}