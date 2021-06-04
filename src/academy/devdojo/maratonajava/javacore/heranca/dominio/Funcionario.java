package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializaçõa estática de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializaçõa de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializaçõa de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void realatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salrio de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
