package questao2;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		if (precoVenda < precoCusto) System.out.println("O preço da venda não pode ser menor que o do custo");
		else this.precoVenda = precoVenda;
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public double calcularMargemLucro() {
		return getPrecoVenda() - getPrecoCusto();
	}
	
	public double getMargemLucroPorcentagem() {
		return calcularMargemLucro() / (getPrecoCusto() / 100);
	}
}
