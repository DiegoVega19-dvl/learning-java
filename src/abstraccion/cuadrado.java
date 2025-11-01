package abstraccion;

public class cuadrado extends Figuras {

	private double lado;

	public cuadrado(double lado, double x, double y) {
		super(x, y);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

}
