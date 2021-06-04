package academy.devdojo.maratonajava.javacore.modificadorfinal.dominio;

public class Comprador {
    private String comprador;

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "comprador: " + comprador ;
    }
}
