package questoes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import questoes.UsaQuadrado;

public class UsaQuadradoTeste {
	
	UsaQuadrado quad = new UsaQuadrado(4);
	
	@Test
	public void perimetroTest () {
		assertTrue(quad.perimetro() == 16);
	}
	
	@Test
	public void areaTest () {
		assertTrue(quad.area() == 16);
	}

}