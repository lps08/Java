package questao3;

public class Teste {

	public static void main(String[] args) {
		Conta conta1 = new Conta(6567, "individuo", 100);
		Conta conta2 = new Conta(6789, "fulano", 4000);
		
		if (conta1.saca(2500)) System.out.println("Deu certo sacar");
		else System.out.println("Erro em sacar");
		
		conta1.deposita(300);
		
		if (conta2.saca(1000)) System.out.println("Deu certo sacar");
		else System.out.println("Erro em sacar");
		
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		System.out.println("Saldo conta 2: " + conta2.getSaldo());
		
		if (conta2.transfere(conta1, 2000)) System.out.println("Deu certo transferir");
		else System.out.println("Erro na transfêrencia");
		
		if (conta1.transfere(conta2, 2500)) System.out.println("Deu certo transferir");
		else System.out.println("Erro na transferência");
		
		conta1.imprimeNome();
		conta2.imprimeNome();
		
		conta1.setNome("individuo Lima");
		conta1.imprimeNome();
	}

}
