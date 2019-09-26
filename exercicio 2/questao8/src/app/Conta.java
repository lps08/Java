package app;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void dizerNomeTitular (String nomeTitular) {
        titular = nomeTitular;
    }

    public void dizerNumeroConta (int numeroConta) {
        numero = numeroConta;
    }

    public void dizerAgencia (String agenciaConta) {
        agencia = agenciaConta;
    }

    public void dizerSaldo (double saldoConta) {
        saldo = saldoConta;
    }

    public void dizerDataAbertura (String dataAberturaConta) {
        dataAbertura = dataAberturaConta;
    }

    public void saca (double valor) {
        saldo -= valor;
    }

    public void deposita (double valor) {
        saldo += valor;
    }

    public double calculaRendimento () {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return "Titular: " + titular + "\n" + "Numero: " + numero + "\n" +
                "Agencia: " + agencia + "\n" + "Saldo: " + saldo + "\n" +
                "Data abertura: " + dataAbertura + "\n" + "Rendimento: " + calculaRendimento();
    }


}