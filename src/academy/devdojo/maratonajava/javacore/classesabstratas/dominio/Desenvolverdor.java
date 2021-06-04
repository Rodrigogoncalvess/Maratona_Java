package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

public class Desenvolverdor extends Funcionario{
    public Desenvolverdor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + salario * 0.05;

    }

    @Override
    public String toString() {
        return "Desenvolverdor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


}
