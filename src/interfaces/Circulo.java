package interfaces;

public class Circulo implements figuras, Diametro {

	private double radio;
	public static final double pi = 3.1416;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		double area = pi * radio * radio;
		return area;
	}

	@Override
	public double calcularDiametro() {
		double diametro = radio * 2;
		return diametro;
	}

}
