package questao7;

public class Tecnico {
	private String nome;
	private String dataNascimento;
	private int cpf;
	private String sexo;
	private String dataEntrada;
	private String ultimoTime;
	
	public Tecnico() {
	}
	
	public Tecnico(String nome, String dataNascimento, int cpf, String sexo, String dataEntrada, String ultimoTime) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataEntrada = dataEntrada;
		this.ultimoTime = ultimoTime;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getUltimoTime() {
		return ultimoTime;
	}
	public void setUltimoTime(String ultimoTime) {
		this.ultimoTime = ultimoTime;
	}
}
