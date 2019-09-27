package app;

public class Professor extends Disciplina {
    String nome;
    int matricula;
    Disciplina disciplina;

    public Professor () {
    }

    public Professor (String nomeProf, int matriculaProf, Disciplina disciplinaProf) {
        nome = nomeProf;
        matricula = matriculaProf;
        disciplina = disciplinaProf;
    }

    public void setNome (String nomeProf) {
        nome = nomeProf;
    }

    public String getNome () {
        return nome;
    }

    public void setMatricula (int matriculaProf) {
        matricula = matriculaProf;
    }

    public int getMatricula () {
        return matricula;
    }

    public void setDisciplina (String nome, int cargaHoraria, int periodo) {
        disciplina.setNome(nome);
        disciplina.setCargaHoraria(cargaHoraria);
        disciplina.setPeriodo(periodo);
    }

    public Disciplina getDisciplina () {
        return disciplina;
    }
}