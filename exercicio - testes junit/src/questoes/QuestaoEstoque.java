package questoes;

public class QuestaoEstoque {

	public static void main(String[] args) {
		UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13, 6);
        UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11, 13);
        UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6, 2);

        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        if (estoque1.precisaRepor()) System.out.println("Precisa repor");
        else System.out.println("Não precisa repor");

        if (estoque2.precisaRepor()) System.out.println("Precisa repor");
        else System.out.println("Não precisa repor");

        if (estoque3.precisaRepor()) System.out.println("Precisa repor");
        else System.out.println("Não precisa repor");

        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());

	}

}
