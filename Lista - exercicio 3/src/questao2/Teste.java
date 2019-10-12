package questao2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Produto prod = new Produto();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o preco de custo: ");
		prod.setPrecoCusto(scan.nextDouble());
		
		System.out.print("Informe o preco de venda: ");
		prod.setPrecoVenda(scan.nextDouble());
		
		System.out.println("Preco de custo: " + prod.getPrecoCusto());
		System.out.println("Preco de Venda: " + prod.getPrecoVenda());
		System.out.println("Margem de Lucro: " + prod.calcularMargemLucro());
		System.out.println("Margem de Lucro Percentual: " + prod.getMargemLucroPorcentagem() + "%");
	}
}