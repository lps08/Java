package questao4;

public class Funcionario {
	private String nome;
	private double cpf;
	private Cargo cargo;
	
	public Funcionario () {
	}
	
	public Funcionario(String nome, int cpf, Cargo cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
