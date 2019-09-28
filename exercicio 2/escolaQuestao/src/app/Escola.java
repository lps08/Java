package app;;

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Disciplina prog = new Disciplina();
        Professor einster = new Professor("Einster", 123445, prog);
        Aluno cicrano = new Aluno("circrano", 736274, 21);

        prog.setNome("Prog");
        prog.setCargaHoraria(60);
        prog.setPeriodo(4);
        prog.setTurno(Turno.TARDE);

        System.out.println("Professor: " + einster.getNome());
        System.out.println("Professor disciplina: " + einster.getDisciplina().getNome());
        System.out.println("Professor matricula: " + einster.getMatricula());
        System.out.println("--------------------------------");
        System.out.println("Aluno: " + cicrano.getNome());
        System.out.println("Aluno matricula: " + cicrano.getMatricula());
        System.out.println("Aluno idade: " + cicrano.getIdade());
        System.out.println("--------------------------------");
        System.out.println("Disciplina: " + prog.getNome());
        System.out.println("Disciplina carga horaria: " + prog.getCargaHoraria());
        System.out.println("Disciplina periodo: " + prog.getPeriodo());
    }
}