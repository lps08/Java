import java.util.Scanner;

public class Questoes { 
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		q8();

	}
	
	static void q1 () {
		System.out.print("Num 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Num 2: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Resultado: " + (num1 + num2));
		System.out.println("Resultado: " + (num1 - num2));
		System.out.println("Resultado: " + (num1 * num2));
		System.out.println("Resultado: " + (num1 / num2));
		
	}
	
	static void q2 () {
		System.out.println("Digite a quilometragem");
		double km = sc.nextDouble();
		System.out.println("Digite o gasto combustivel");
		double litro = sc.nextDouble();
		
		System.out.println("Consumo: " + (km / litro));		
		
		
	}
	
	static void q3 () {
		System.out.print("Nome vendedor");
		String nome = sc.nextLine();
		System.out.print("Salario fixo");
		double salaroFixo = sc.nextDouble();
		System.out.print("Total vendas: ");
		double totalVendas = sc.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Salario fixo: " + salaroFixo);
		System.out.println("Salario final: " + (salaroFixo + (totalVendas * 0.15)));
		
	}
	
	static void q4 () {
		System.out.print("Informe a temperatura em ceusius: ");
		double ceusius = sc.nextDouble();
		double f = ((9 * ceusius + 160)/5);
		System.out.println("Temperatura em f: " + f);
		
	}
	
	static void q5 () {
		System.out.print("Valor dolar: ");
		double dolar = sc.nextDouble();
		System.out.print("Cotação dolar: ");
		double cotacao = sc.nextDouble();
		
		System.out.println("Convenção de dolar para real: " + (dolar * cotacao));		
	
	}
	
	static void q6 () {

		System.out.print("Insira o valor de deposito: ");
		double valorConta = sc.nextDouble();
		System.out.println("Rendimento após 1 mês: " + (valorConta + (valorConta * 0.070)));

	}

	static void q7 () {
		System.out.print("Valor da compra: ");
		double compra = sc.nextDouble();
		System.out.println("Valor da prestação: " + (compra / 5) + " R$");

	}

	static void q8 () {
		System.out.print("Preço de custo do produto: ");
		double custo = sc.nextDouble();
		System.out.print("Percentual para o produto: ");
		double perc = sc.nextDouble();
		System.out.println("Preço final: " + (custo + (custo * (perc / 100))));

	}

}
