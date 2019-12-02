package delta.calculator;

public class DeltaCalculator {
	
	double a, b, c;
	
	public DeltaCalculator() {
	}
	
	public DeltaCalculator(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getDelta() {
		return (this.b * this.b) - (4 * this.a * this.c);
	}
}
