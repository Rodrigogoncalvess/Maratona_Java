package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

    //Crie classe funcionário com os seguintes atributos: nome, idade e salario deve ser guardado 3.
    // crie dois métodos: imprimir os dados / tirar média do salário e imprimir o resultado.

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario: salarios){
                System.out.println(salario + " ");
            }

        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /=salarios.length;

        System.out.println("\nMédia salarial " + media);
    }

}
