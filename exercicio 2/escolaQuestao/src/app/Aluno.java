package app;

public class Aluno {
    String nome;
    int matricula;
    int idade;

    public Aluno () {
    }

    public Aluno (String nomeAluno, int matriculaAluno, int idadeAluno) {
        nome = nomeAluno;
        matricula = matriculaAluno;
        idade = idadeAluno;
    }

    public void setNome (String nomeAluno) {
        nome = nomeAluno;
    }

    public String getNome () {
        return nome;
    }

    public void setMatricula (int matriculaAluno) {
        matricula = matriculaAluno;
    }

    public int getMatricula () {
        return matricula;
    }

    public void setIdade (int idadeAluno) {
        idade = idadeAluno;
    }

    public int getIdade () {
        return idade;
    }

    public void infoAluno () {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
    }
}