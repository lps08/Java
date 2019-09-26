package app;

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

    public void mudarNome (String nomeEstoque) {
        nome = nomeEstoque;
    }

    public void mudarQtdMinima (int qtdMinimaEstoque) {
        qtdMinima = qtdMinimaEstoque;
    }

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public void darBaixa (int qtd) {
        qtdMinima -= qtd;
    }

    public String mostra () {
        return "Nome: " + nome + ", " + "quantidade minima: " + String.valueOf(qtdMinima) + ", " + "Quantidade atual" + String.valueOf(qtdAtual);
    }

    public Boolean precisaRepor () {
        return (qtdAtual <= qtdMinima);
    }
}