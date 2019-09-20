import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questoes { 
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		q30();
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

	static void q9 () {
		System.out.print("Custo carro: ");
		double custoCarro = sc.nextDouble();
		//ERRADO
		custoCarro += custoCarro * 0.28;
		custoCarro += custoCarro * 0.45;
		System.out.println("Preço final: " + custoCarro);
	}

	static void q10 () {
		int A = 10, B = 20, c;
		c = A;
		A = B;
		B = c;
		System.out.println("A: " + A + " B: " + B);
	}

	static void q11 () {
		System.out.println("LETRA A");
		int a = 100, b = 120;
		System.out.println(b);
		b = 234;
		System.out.println(a + " " + b);
		
		System.out.println("LETRA B");
		a = 23;
		b = 56;
		int c = a + b;
		b = 34;
		a = 67;
		System.out.println(a + " " + b + " " + c);

		System.out.println("LETRA C");
		a = 300;
		b = 200;
		c = a + b;
		System.out.println(c);
		b = 140;
		System.out.println(b + " " + c);
		c = a + b;
		System.out.println(a + " " + b + " " + c);
		
		/* ERROR
		System.out.println("LETRA D");
		int x = 1, y = 23;
		int z = y - z;
		System.out.println(z);
		x = 5
		y = x + z; */
	}

	static void q12 () {
		double a = (4/2) + (2/4);
		double A = 4/2 + 2/4;
		double b = 4/(2+2)/4;
		double B = 4/2 + 2/4;
		double c = (4+2)*2-4;
		double C = 4+2*2-4;
		if (a == A) System.out.println("A - Igual");
		else System.out.println("A - Diferente");
		if (b == B) System.out.println("B - Igual");
		else System.out.println("B - Diferente");
		if (c == C) System.out.println("C - Igual");
		else System.out.println("C - Diferente");
	}

	static void q13 () {
		int a = 6*(3+2);
		System.out.println(a);
		int b = 6 * (3+2) + 2;
		System.out.println(b);
		int c = 2 + 3 * 6 / (2 + 4);
		System.out.println(c);
		int d = 2*8/(3+1);
		System.out.println(d);
		int e = 3+(16-2)/(2*(9-2));
		System.out.println(e);
		int f = 6/3 + 8/2;
		System.out.println(f);
		int g = (3+8/2)*4+3*2;
		System.out.println(g);
		int h = 6*3*3+6-10;
		System.out.println(h);
		int i = (10*8+3)*9;
		System.out.println(i);
		int j = -12*-4+3*-4;
		System.out.println(j);
	}

	static void q14 () {
		System.out.print("Numero: ");
		int valor = sc.nextInt();
		System.out.format("Antecessor: %d | Sucessor: %d\n", valor - 1, valor + 1);
	}

	static void q15 () {
		System.out.print("Base retângulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura retângulo: ");
		double altura = sc.nextDouble();
		System.out.println("Área total: " + (base * altura));
	}

	static void q16 () {
		System.out.print("Anos: ");
		int anos = sc.nextInt();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		System.out.print("Dias: ");
		int dias = sc.nextInt();

		System.out.println("Idade em dias: " + ((365 * anos) + (meses * 30) + dias));
	}

	static void q17 () {
		System.out.print("Total de Eleitores: ");
		double totalEleitores = sc.nextDouble();
		System.out.print("Votos brancos: ");
		double votosBrancos = sc.nextDouble();
		System.out.print("Votos nulos: ");
		double votosNulos = sc.nextDouble();
		System.out.print("Votos válidos: ");
		double votosValidos = sc.nextDouble();

		System.out.println("pert votos brancos: " + (totalEleitores/100) * votosBrancos  + " %");
		System.out.println("pert votos nulos: " + (totalEleitores/100) * votosNulos + " %");
		System.out.println("pert votos validos: " + (totalEleitores/100) * votosValidos + " %");
	}

	static void q18 () {
		System.out.print("Salario mensal atual: ");
		double salarioAtual = sc.nextInt();
		System.out.print("Percentual reajuste: ");
		double percReajuste = sc.nextDouble();

		System.out.println("Novo salário: " + (salarioAtual + (salarioAtual * (percReajuste / 100))));
	}

	static void q19 () {
		System.out.print("Custo do carro: ");
		double custoCarro = sc.nextDouble();
		custoCarro += custoCarro * 0.28;
		custoCarro += custoCarro * 0.45;
		System.out.println("Preço carro consumidor: " + custoCarro);
	}

	static void q20 () {
		System.out.print("Numero de carros vendidos: ");
		int numCarrosVendidos = sc.nextInt();
		System.out.print("Valor total das vendas: ");
		double valorTotalVendas = sc.nextDouble();
		System.out.print("Salario fixo: ");
		double salarioFixo = sc.nextDouble();
		System.out.print("Valor por carro vendido: ");
		double valorCadaCarroVendido = sc.nextDouble();

		System.out.println("Salario final: " + (salarioFixo + (numCarrosVendidos * valorCadaCarroVendido) + (valorTotalVendas * 0.05)));
	}

	static void q21 () {
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		if (valor > 10) System.out.println("MAIOR QUE 10!");
		else System.out.println("NÃO É MAIOR QUE 10");
	}

	static void q22 () {
		System.err.print("Valor: ");
		double valor = sc.nextDouble();
		if (valor > 0) System.out.println("Positivo");
		else System.out.println("Negativo");
	}

	static void q23 ()	{
		System.out.print("Numero de maçãs: ");
		int numMaca = sc.nextInt();
		double preco;
		if (numMaca < 12) preco = 1.30 * numMaca;
		else  preco = 1.00 * numMaca;
		System.out.println("Preço: " + preco);
	}

	static void q24 () {
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2)/2;

		if (media < 6) System.out.println("Reprovado");
		else System.out.println("Aprovado");
		System.out.println("Media: " + media);
	}

	static void q25 () {
		System.out.print("Ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.print("Ano de nascimento: ");
		int anoNascimento = sc.nextInt();

		if ((anoAtual - anoNascimento) < 16) System.out.println("Não poderá votar");
		else System.out.println("Poderá votar");
	}

	static void q26 () {
		System.out.print("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.print("Valor 2: ");
		int valor2 = sc.nextInt();
		if (valor2 == valor1) {
			System.out.format("Nao pode repetir valor\nValor 2: ");
			valor2 = sc.nextInt();
		}

		if (valor1 > valor2) System.out.println("Maior: " + valor1);
		else System.out.println("Maior: " + valor2);
	}

	static void q27 () {
		System.out.print("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.print("Valor 2: ");
		int valor2 = sc.nextInt();
		List<Integer> valors = new ArrayList<>();
		valors.add(valor1);
		valors.add(valor2);
		Collections.sort(valors);
		System.out.println("Lista : " + valors);
	}

	static void q28 () {
		System.out.print("Hora inicio: ");
		int horaInicio = sc.nextInt();
		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();

		int horaTotal = horaFinal - horaInicio;

		if (horaTotal < 0) horaTotal += 24;

		System.out.println("Hora total: " + horaTotal + " horas");
	}

	static void q29 () {
		System.out.print("Numero de horas trabalhadas no mes: ");
		int horaTrabalhada = sc.nextInt();
		System.out.print("Salario por horas: ");
		int salarioHora = sc.nextInt();
		double horaSemanal = horaTrabalhada / 4;
		double salarioTotal;
		if (horaSemanal > 40) {
			salarioHora += salarioHora * 0.5;
			salarioTotal = salarioHora * horaTrabalhada;
		}
		salarioTotal = horaTrabalhada * salarioHora;

		System.out.println("Salario total: " + salarioTotal);
	}

	static void q30 () {
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		System.out.print("Sexo [M/F]: ");
		String sexo = sc.next();
		double pesoIdeal = 0;

		if (sexo.equals("M") || sexo.equals("m")) pesoIdeal = (72.7 * altura) - 58;
		else pesoIdeal = (62.1 * altura) - 44.7;

		System.out.println("Peso ideal: " + pesoIdeal);
	}
}
