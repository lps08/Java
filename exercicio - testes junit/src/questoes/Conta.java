package questoes;

public class Conta {
	String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    

    public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
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
