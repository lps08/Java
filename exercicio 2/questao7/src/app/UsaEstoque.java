package app;

public class UsaEstoque extends Estoque{
    public UsaEstoque () {
        super();
    }

    public UsaEstoque (String nomeEstoque, int qtdAtualEstoque, int qtdMinimaEstoque) {
        super(nomeEstoque, qtdAtualEstoque, qtdMinimaEstoque);
    }
}