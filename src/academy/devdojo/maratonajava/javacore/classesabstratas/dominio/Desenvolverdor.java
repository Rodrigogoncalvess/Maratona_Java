package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

public class Desenvolverdor extends Funcionario{
    public Desenvolverdor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolverdor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
