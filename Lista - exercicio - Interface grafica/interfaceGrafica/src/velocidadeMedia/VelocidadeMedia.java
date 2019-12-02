package velocidadeMedia;

public class VelocidadeMedia {
	
	double distancia;
	double tempo;
	
	public VelocidadeMedia(double distancia, double tempo) {
		this.distancia = distancia;
		this.tempo = tempo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getVelocidadeMedia() {
		return this.distancia / this.tempo;
	}
}
