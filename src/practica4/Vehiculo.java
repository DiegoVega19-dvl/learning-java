package practica4;

public class Vehiculo {

	public String marca;
	public int VelocidadMax;

	public Vehiculo(String marca, int velocidadMax) {
		this.marca = marca;
		this.VelocidadMax = velocidadMax;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMax() {
		return VelocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		VelocidadMax = velocidadMax;
	}

	public void mostrarInfo() {

	}

}
