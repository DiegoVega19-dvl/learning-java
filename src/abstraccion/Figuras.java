package abstraccion;

public abstract class Figuras {

	protected double y;
	protected double x;

	protected Figuras(double y, double x) {
		this.y = y;
		this.x = x;
	}

	public abstract double calcularArea();

}
