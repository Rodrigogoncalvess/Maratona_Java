package academy.devdojo.maratonajava.javacore.Minterface.dominio;


public class DataBaseLoader implements DataLoader,DataRemover{

    @Override
    public void load(){
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
}
