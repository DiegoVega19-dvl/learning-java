package practica4;

public class Auto extends Vehiculo {

	public Auto(String marca, int velocidadMax) {
		super(marca, velocidadMax);
	}

	@Override
	public void mostrarInfo() {
		System.out.println("esto es un Auto");
		System.out.println("la marca es: " + marca + " y su velocidad Maxima es: " + VelocidadMax);
		super.mostrarInfo();
	}

}
