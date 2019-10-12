package questao6;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> array =  new ArrayList<Integer>();
		Random randon = new Random();
		Verificar verificar = new Verificar();
		
		for(int i = 1; i <= randon.nextInt(); i ++) {
			array.add(i);
		}
		
		verificar.setArray(array);
		verificar.tamanho();
		verificar.positivo();
		verificar.negativo();
		verificar.primos();
		verificar.divisiveis(3);
		
	}
}
