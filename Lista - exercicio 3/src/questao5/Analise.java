package questao5;

public class Analise {
	
	public Analise(int preco, int economiaEnergia, int portabilidade, int design, int qualidadeAudio, int video) {
		this.preco = preco;
		this.economiaEnergia = economiaEnergia;
		this.portabilidade = portabilidade;
		this.design = design;
		this.qualidadeAudio = qualidadeAudio;
		this.video = video;
	}
	
	private int preco, economiaEnergia, portabilidade, design, qualidadeAudio, video;

	private double resultado;

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		condicao(preco, this.preco);
	}

	public int getEconomiaEnergia() {
		return economiaEnergia;
	}

	public void setEconomiaEnergia(int economiaEnergia) {
		condicao(economiaEnergia, this.economiaEnergia);
	}

	public int getPortabilidade() {
		return portabilidade;
	}

	public void setPortabilidade(int portabilidade) {
		condicao(portabilidade, this.portabilidade);
	}

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		condicao(design, this.design);
	}

	public int getQualidadeAudio() {
		return qualidadeAudio;
	}

	public void setQualidadeAudio(int qualidadeAudio) {
		condicao(qualidadeAudio, this.qualidadeAudio);
	}

	public int getVideo() {
		return video;
	}

	public void setVideo(int video) {
		condicao(video, this.video);
	}
	
	private void condicao(int notaObjetivo, int nota) {
		if (nota <= 5 && nota >= 0) {
			nota = notaObjetivo;
		}else System.out.println("Nota errada");
	}
	
	public double analiseGeral() {
		resultado = (preco + economiaEnergia + portabilidade + design + qualidadeAudio + video + resultado)/7;
		return resultado;
	}
}
