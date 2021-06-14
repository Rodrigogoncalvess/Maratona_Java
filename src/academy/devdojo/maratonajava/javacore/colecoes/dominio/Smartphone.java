package academy.devdojo.maratonajava.javacore.colecoes.dominio;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String seriaNumber, String marca) {
        this.serialNumber = seriaNumber;
        this.marca = marca;
    }
    //Reflexivo: x.equals(x) te que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferente de null, se x.equals(y) == true logo, y.equals(x) == true
    //Transitividade: para x,y,z diferente de null, se x .equals(z) == true logo, y.equals(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retorna false


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return true;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, getMarca());
    }

    public String getSeriaNumber() {
        return serialNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.serialNumber = seriaNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
