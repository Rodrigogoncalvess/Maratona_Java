package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader{

    @Override
    public void load(){
        System.out.println("Carregando dados de um banco de dados");
    }
}
