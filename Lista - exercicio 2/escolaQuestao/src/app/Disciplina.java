package app;

public class Disciplina {
    String nome;
    int cargaHoraria;
    int periodo;
    Turno turno;

    public Disciplina () {
    }

    public Disciplina (String nomeDiscip, int cargaHorariaDiscip, int periodoDisp, Turno turnoDiscip) {
        nome = nomeDiscip;
        cargaHoraria = cargaHorariaDiscip;
        periodo = periodoDisp;
        turno = turnoDiscip;
    }

    public void setNome (String nomeDiscip) {
        nome = nomeDiscip;
    }

    public String getNome () {
        return nome;
    }

    public void setCargaHoraria(int cargaHorariaDiscip) {
        cargaHoraria = cargaHorariaDiscip;
    }

    public int getCargaHoraria () {
        return cargaHoraria;
    }

    public void setPeriodo (int periodoDiscip) {
        periodo = periodoDiscip;
    }

    public int getPeriodo () {
        return periodo;
    }

    public void setTurno (Turno turnoDiscip) {
        turno = turnoDiscip;
    }

    public Turno getTurno () {
        return turno;
    }
}