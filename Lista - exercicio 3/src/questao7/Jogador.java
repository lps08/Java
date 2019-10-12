package questao7;

public class Jogador {
	private String nome;
	private String dataNascimento;
	private int cpf;
	private String sexo;
	private Time time = new Time();
	private String posicao;
	private int golsPro;
	private int golsContra;
	private int cartoesAmarelos;
	private int cartoesVermelhos;
	private int partidasJogadas;
	
	public Jogador() {
	}
	
	public Jogador(String nome, String dataNascimento, int cpf, String sexo, Time time, String posicao, int golsPro,
			int golsContra, int cartoesAmarelos, int cartoesVermelhos, int partidasJogadas) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
		this.time = time;
		this.posicao = posicao;
		this.golsPro = golsPro;
		this.golsContra = golsContra;
		this.cartoesAmarelos = cartoesAmarelos;
		this.cartoesVermelhos = cartoesVermelhos;
		this.partidasJogadas = partidasJogadas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getGolsPro() {
		return golsPro;
	}
	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}
	public int getGolsContra() {
		return golsContra;
	}
	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}
	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}
	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}
	public int getCartoesVermelhos() {
		return cartoesVermelhos;
	}
	public void setCartoesVermelhos(int cartoesVermelhos) {
		this.cartoesVermelhos = cartoesVermelhos;
	}
	public int getPartidasJogadas() {
		return partidasJogadas;
	}
	public void setPartidasJogadas(int partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}	
}
