package questao7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		
		Tecnico jaime = new Tecnico("Jaime", "10/05/76", 265362, "Masculino", "08/09/2019", "Paisandu");
		Time julho4 = new Time("4 de julho", "04/07/84", jogadores, jaime);
		
		Jogador j1 = new Jogador("j1", "10/07/98", 623526, "Masculino", julho4, "Ataque", 12, 0, 2, 1, 20);
		Jogador j2 = new Jogador("j2", "06/02/98", 767677, "Masculino", julho4, "meio", 11, 0, 4, 1, 20);
		Jogador j3 = new Jogador("j3", "26/06/98", 767677, "Masculino", julho4, "zaga", 6, 0, 2, 1, 20);
		Jogador j4 = new Jogador("j4", "16/12/98", 767677, "Masculino", julho4, "zaga", 9, 0, 4, 0, 20);
		Jogador j5 = new Jogador("j5", "08/03/98", 767677, "Masculino", julho4, "goleiro", 5, 0, 0, 0, 20);
		
		jogadores.add(j1);
		jogadores.add(j2);
		jogadores.add(j3);
		jogadores.add(j4);
		jogadores.add(j5);
		
		julho4.artilheiro();
		julho4.experiente();
		julho4.statusTime();
	}
}
