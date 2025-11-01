package practica4;

public class Moto extends Vehiculo {

	public Moto(String marca, int velocidadMax) {
		super(marca, velocidadMax);
	}

	@Override
	public void mostrarInfo() {
		System.out.println("esto es una Moto");
		System.out.println("la marca es: " + marca + " y su velocidad Maxima es: " + VelocidadMax);
		super.mostrarInfo();
	}

}
