package questoes;

public class Estoque {
	
	String nome;
    int qtdAtual;
    int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nomeEstoque, int qtdAtualEstoque, int qtdMinimaEstoque) {
        nome = nomeEstoque;
        qtdAtual = qtdAtualEstoque;
        qtdMinima = qtdMinimaEstoque;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public void darBaixa (int qtd) {
        qtdAtual -= qtd;
    }

    public String mostra () {
        return "Nome: " + nome + ", " + "quantidade minima: " + String.valueOf(qtdMinima) + ", " + "Quantidade atual: " + String.valueOf(qtdAtual);
    }

    public Boolean precisaRepor () {
        return (qtdAtual <= qtdMinima);
    }

}
