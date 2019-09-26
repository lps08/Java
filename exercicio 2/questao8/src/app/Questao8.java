package app;

public class Questao8 {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta();

        c1.dizerNomeTitular("Luciano");
        c1.dizerNumeroConta(18975);
        c1.dizerAgencia("TesteAgencia");
        c1.dizerSaldo(80000);
        c1.dizerDataAbertura("10/07/2019");

        c1.saca(1000);
        c1.deposita(2000);

        System.out.println(c1.recuperaDadosParaImpressao());

    }
}