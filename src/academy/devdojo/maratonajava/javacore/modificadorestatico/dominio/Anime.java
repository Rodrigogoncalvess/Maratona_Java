package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //Bloco de inicialzação é executado quando a JVM carrga a classe
    //alocado espaço em memória pro projeto
    //Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    //Bloco de inicialização é executado
    //Construtor é executado

   static {
       System.out.println("Dentro do bloco de inicialização estático 1");
       episodios = new int[100];
       for (int i = 0; i < episodios.length; i++) {
           episodios[i] = i + 1;

       }
   }
      static {
          System.out.println("Dentro do bloco de inicialização estático 2");
      }
    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
   }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios: Anime.episodios){
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
