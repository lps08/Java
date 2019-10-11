package questoes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import questoes.Conta;
import org.junit.Test;

public class ContaTest {
	
	Conta c1 = new Conta();
	
	@Test
	public void testeSaca() {
		c1.setTitular("Luciano");
        c1.setNumero(18975);
        c1.setAgencia("TesteAgencia");
        c1.setSaldo(80000);
        c1.setDataAbertura("10/07/2019");
        c1.saca(2000);
        
        assertTrue(c1.getSaldo() == (80000 - 2000));
		assertFalse(c1.getSaldo() != (80000 - 2000));
	}
	
	@Test
	public void testeDeposita() {
		c1.setTitular("Luciano");
        c1.setNumero(18975);
        c1.setAgencia("TesteAgencia");
        c1.setSaldo(80000);
        c1.setDataAbertura("10/07/2019");
		c1.deposita(2000);
		
		assertTrue(c1.getSaldo() == (80000 + 2000));
		assertFalse(c1.getSaldo() != (80000 + 2000));
	}
	
	@Test
	public void testCalculaRendimento () {
		
		c1.setTitular("Luciano");
        c1.setNumero(18975);
        c1.setAgencia("TesteAgencia");
        c1.setSaldo(80000);
        c1.setDataAbertura("10/07/2019");
        
        assertTrue(c1.calculaRendimento() == 8000);
        assertFalse(c1.calculaRendimento() != 8000);
        
	}
	
	@Test
	public void testeRecuperaDadosParaImpressao() {
		c1.setTitular("Luciano");
        c1.setNumero(18975);
        c1.setAgencia("TesteAgencia");
        c1.setSaldo(80000);
        c1.setDataAbertura("10/07/2019");
        
        assertTrue(c1.recuperaDadosParaImpressao().equals("Titular: " + c1.getTitular() +"\n" + "Numero: "+ c1.getNumero() +"\n" +
                "Agencia: "+ c1.getAgencia() + "\n" + "Saldo: "+ c1.getSaldo() + "\n" + "Data abertura: "+ c1.getDataAbertura() +"\n" + 
        		"Rendimento: " + c1.calculaRendimento()));
        
        assertFalse(!c1.recuperaDadosParaImpressao().equals("Titular: " + c1.getTitular() +"\n" + "Numero: "+ c1.getNumero() +"\n" +
                "Agencia: "+ c1.getAgencia() + "\n" + "Saldo: "+ c1.getSaldo() + "\n" + "Data abertura: "+ c1.getDataAbertura() +"\n" + 
        		"Rendimento: " + c1.calculaRendimento()));
	}
}
