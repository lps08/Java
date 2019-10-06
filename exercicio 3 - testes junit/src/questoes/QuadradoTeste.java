package questoes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import questoes.Quadrado;

public class QuadradoTeste {
	
	Quadrado quad = new Quadrado(4);
	
	@Test
	public void perimetroTest () {
		assertTrue(quad.perimetro() == 16);
	}
	
	@Test
	public void areaTest () {
		assertTrue(quad.area() == 16);
	}

}
