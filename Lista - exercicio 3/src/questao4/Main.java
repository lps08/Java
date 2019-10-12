package questao4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcListAdmin = new ArrayList<Funcionario>();
		ArrayList<Funcionario> funcListExec = new ArrayList<Funcionario>();
		ArrayList<Funcionario> funcListEmpre = new ArrayList<Funcionario>();
		ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();
		
		Funcionario fa1 = new Funcionario("fa1", 723667, Cargo.ADMINISTRATIVO);
		Funcionario fa2 = new Funcionario("fa2", 725667, Cargo.ADMINISTRATIVO);
		funcListAdmin.add(fa1);
		funcListAdmin.add(fa2);
		funcList.add(fa1);
		funcList.add(fa2);
		Funcionario fem3 = new Funcionario("fem3", 723667, Cargo.EMPRESARIAL);
		Funcionario fem4 = new Funcionario("fem4", 723667, Cargo.EMPRESARIAL);
		funcListEmpre.add(fem3);
		funcListEmpre.add(fem4);
		funcList.add(fem3);
		funcList.add(fem4);
		Funcionario fex5 = new Funcionario("fex4", 723677, Cargo.EMPRESARIAL);
		Funcionario fex6 = new Funcionario("fex5", 753667, Cargo.EMPRESARIAL);
		funcListExec.add(fex5);
		funcListExec.add(fex6);
		funcList.add(fex5);
		funcList.add(fex6);
		
		for (Funcionario i: funcListAdmin) System.out.println("Nome admin: " + i.getNome());
		for (Funcionario i: funcListExec) System.out.println("Nome exec: " + i.getNome());
		for (Funcionario i: funcListEmpre) System.out.println("Nome empre: " + i.getNome());
		for (Funcionario i: funcList) System.out.println("Nome all: " + i.getNome());
	}

}
