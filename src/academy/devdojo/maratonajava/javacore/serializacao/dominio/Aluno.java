package academy.devdojo.maratonajava.javacore.serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 6452820952337485602L;

    private long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo viradão";
    private transient Turma turma;


    public Aluno(long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    @Serial
    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
                turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
