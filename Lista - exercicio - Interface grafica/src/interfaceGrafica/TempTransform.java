package interfaceGrafica;

public class TempTransform {
	double f;
	
	public TempTransform(double f) {
		this.f = f;
	}
	
	public double getCeusiusTemperature() {
		double c = (this.f - 32) / 1.8;
		return c;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}	
}
