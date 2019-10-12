package questao6;

import java.util.ArrayList;

public class Verificar {
	
	private ArrayList<Integer> array = new ArrayList<Integer>();
	private int positivos, negativos, primos = 0, divisivelX;
	
	public Verificar() {
	}
	
	public Verificar(ArrayList<Integer> array) {
		this.array = array;		
	}

	public ArrayList<Integer> getArray() {
		return array;
	}

	public void setArray(ArrayList<Integer> array) {
		this.array = array;
	}
	
	public void tamanho() {
		System.out.println("Tamanho: " + this.array.size());
	}
	
	public void positivo() {
		for (Integer i: this.array) if (i > 0) positivos++;
		System.out.println("Numeros positivos: " + positivos);
	}
	
	public void negativo() {
		for (Integer i: this.array) if (i < 0) negativos++;
		System.out.println("Numeros negativos: " + negativos);
	}
	
	public void primos() {
		int cont = 0;
		
		for (Integer i: array) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) cont+=1;
			}
			if (cont == 2) primos++;
			
			cont = 0;
		}
		
		System.out.println("Numeros primos: " + primos);
			
	}
	
	public void divisiveis(int numUsuario) {
		for (Integer i: this.array) if (i % numUsuario == 0) divisivelX++;
		System.out.println("Numeros divisíveis por " + numUsuario + ": " + divisivelX);
	}
	
}
