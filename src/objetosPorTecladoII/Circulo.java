package objetosPorTecladoII;

public class Circulo extends Figuras {

	private double radio;

	public Circulo() {

	}

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
		double area = Math.PI * radio * radio;
		return area;
	}

}
