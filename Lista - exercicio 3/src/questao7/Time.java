package questao7;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String fundacao;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private Tecnico tecnico = new Tecnico();
	
	public Time() {
	}
		
	public Time(String nome, String fundacao, ArrayList<Jogador> jogadores,
			Tecnico tecnico) {
		this.nome = nome;
		this.fundacao = fundacao;
		this.jogadores = jogadores;
		this.tecnico = tecnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFundacao() {
		return fundacao;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public void artilheiro() {
		int artilheiroIdx = 0, maior = 0;
		
		for (int i = 0; i < jogadores.size(); i++) {
			if (jogadores.get(i).getGolsPro() > maior) {
				maior = jogadores.get(i).getGolsPro();
				artilheiroIdx = i;
			}
		}
		System.out.println("O jogador artilheiro: " + jogadores.get(artilheiroIdx).getNome());
	}
	
	public void experiente() {
		int experienteIdx = 0, maior = 0;
		
		for (int i = 0; i < jogadores.size(); i++) {
			if (jogadores.get(i).getPartidasJogadas() > maior) {
				maior = jogadores.get(i).getPartidasJogadas();
				experienteIdx = i;
			}
		}
		System.out.println("Jogar mais experiente: " + jogadores.get(experienteIdx).getNome());
	}
	
	public void statusTime() {
		System.out.println("Jogadoes: ");
		for (Jogador i: jogadores) {
			System.out.println("\tNome: " + i.getNome() + " | Posição: " + i.getPosicao());
		}
		System.out.println("\nTecnico: ");
		System.out.println("\tNome: " + tecnico.getNome() + " | Data entrada: " + tecnico.getDataEntrada());
	}
}

