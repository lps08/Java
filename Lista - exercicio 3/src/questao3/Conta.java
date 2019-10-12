package questao3;

public class Conta {
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	private int numero;
	private String nome;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else return false;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;		
	}
	
	public Boolean transfere(Conta destino, double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else return false;
	}
	
	public void imprimeNome() {
		System.out.format("Nome: %s\nSaldo: %.2f\n", this.nome, this.saldo);
	}
}
