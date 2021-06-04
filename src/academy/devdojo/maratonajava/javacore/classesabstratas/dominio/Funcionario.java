package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

import java.util.SplittableRandom;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
