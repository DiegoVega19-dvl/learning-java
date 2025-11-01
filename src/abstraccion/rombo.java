package abstraccion;

public class rombo extends Figuras {

	private double diagonalM;
	private double diagonalm;

	public rombo(double diagonalM, double diagonalm, double x, double y) {
		super(x, y);
		this.diagonalM = diagonalM;
		this.diagonalm = diagonalm;
	}

	@Override
	public double calcularArea() {
		double area = (diagonalM * diagonalm) / 2;
		return area;
	}

}
