package interfaces;

public class Cuadrado implements figuras {

	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

}
