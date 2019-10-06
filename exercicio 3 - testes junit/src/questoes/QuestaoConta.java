package questoes;

public class QuestaoConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();

        c1.setTitular("Luciano");
        c1.setNumero(18975);
        c1.setAgencia("TesteAgencia");
        c1.setSaldo(80000);
        c1.setDataAbertura("10/07/2019");

        c1.saca(1000);
        c1.deposita(2000);

        System.out.println(c1.recuperaDadosParaImpressao());
		
	}
}
