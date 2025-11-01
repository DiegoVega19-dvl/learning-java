package objetosPorTecladoII;

public class Cuadrado extends Figuras {

	private double lado;

	public Cuadrado() {

	}

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
