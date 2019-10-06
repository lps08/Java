package questoes;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import questoes.UsaEstoque;

public class UsaEstoqueTest {
	Estoque estoque1 = new Estoque("pizza", 10, 12);
	
	@Test
	public void testeRepor() {
		UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13, 6);
        UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11, 13);
        UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6, 2);
        
        estoque1.repor(1);
        estoque2.repor(1);
        estoque3.repor(1);
        
        assertTrue(estoque1.getQtdAtual() == (13 + 1));
        assertFalse(estoque1.getQtdAtual() != (13 + 1));
        
        assertTrue(estoque2.getQtdAtual() == (11 + 1));
        assertFalse(estoque2.getQtdAtual() != (11 + 1));
        
        assertTrue(estoque3.getQtdAtual() == (6 + 1));
        assertFalse(estoque3.getQtdAtual() != (6 + 1));
	}
	
	@Test
	public void testeDarBaixa() {
		UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13, 6);
        UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11, 13);
        UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6, 2);
        
        estoque1.darBaixa(1);
        estoque2.darBaixa(1);
        estoque3.darBaixa(1);
        
        assertTrue(estoque1.getQtdAtual() == (13 -1));
        assertFalse(estoque1.getQtdAtual() != (13 -1));
        
        assertTrue(estoque2.getQtdAtual() == (11 -1));
        assertFalse(estoque2.getQtdAtual() != (11 -1));
        
        assertTrue(estoque3.getQtdAtual() == (6 -1));
        assertFalse(estoque3.getQtdAtual() != (6 -1));
	}
	
	@Test
	public void testeMostra() {
		UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13, 6);
        UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11, 13);
        UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6, 2);
        
        assertTrue(estoque1.mostra().equals("Nome: Impressora Jato de Tinta, quantidade minima: 6, Quantidade atual: 13"));
        assertFalse(!estoque1.mostra().equals("Nome: Impressora Jato de Tinta, quantidade minima: 6, Quantidade atual: 13"));
        
        assertTrue(estoque2.mostra().equals("Nome: Monitor LCD 17 polegadas, quantidade minima: 13, Quantidade atual: 11"));
        assertFalse(!estoque2.mostra().equals("Nome: Monitor LCD 17 polegadas, quantidade minima: 13, Quantidade atual: 11"));
        
        assertTrue(estoque3.mostra().equals("Nome: Mouse Ótico, quantidade minima: 2, Quantidade atual: 6"));
        assertFalse(!estoque3.mostra().equals("Nome: Mouse Ótico, quantidade minima: 2, Quantidade atual: 6"));
		
	}
	
	@Test
	public void testePrecisaRepor () {
		
		UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13, 6);
        UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11, 13);
        UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6, 2);
        
        estoque1.darBaixa(8);
        estoque3.darBaixa(5);
		
		assertTrue(estoque1.precisaRepor() == true);
		assertFalse(estoque1.precisaRepor() != true);
		
		assertTrue(estoque2.precisaRepor() == true);
		assertFalse(estoque2.precisaRepor() != true);
		
		assertTrue(estoque3.precisaRepor() == true);
		assertFalse(estoque3.precisaRepor() != true);	
	}
	
}
