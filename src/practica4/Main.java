package practica4;

public class Main {

	public static void main(String[] args) {

		Vehiculo[] carro = new Vehiculo[5];
		carro[0] = new Moto("Honda", 250);
		carro[1] = new Auto("Honda", 250);
		carro[2] = new Moto("Ninja", 250);
		carro[3] = new Auto("Toyota", 250);
		carro[4] = new Moto("Suzuki", 250);

		for (int i = 0; i < carro.length; i++) {
			carro[i].mostrarInfo();
		}

	}
}
