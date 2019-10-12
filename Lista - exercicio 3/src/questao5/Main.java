package questao5;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	
		ArrayList<Analise> analises = new ArrayList<Analise>();	
		ArrayList<Analise> analisesBom = new ArrayList<Analise>();
		
		Analise pc1 = new Analise(4, 3, 5, 5, 2, 3); //bom
		Analise pc2 = new Analise(2, 1, 2, 0, 3, 2);
		Analise pc3 = new Analise(4, 5, 5, 4, 4, 5); //bom
		Analise pc4 = new Analise(2, 1, 2, 1, 1, 2);
		Analise pc5 = new Analise(4, 5, 5, 5, 5, 5); //bom
		
		analises.add(pc1);
		analises.add(pc2);
		analises.add(pc3);
		analises.add(pc4);
		analises.add(pc5);
		
		for (Analise i: analises) {
			if (i.analiseGeral() >= 3) {
				analisesBom.add(i);
			}
		}
		
		System.out.println("Pcs bons: " + analisesBom.size());
	}
}
