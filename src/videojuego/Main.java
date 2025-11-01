package videojuego;

public class Main {

	public static void main(String[] args) {

		// no puedes instanciar directamente de la clase abstracta
		// Personaje tanque = new Personaje("Roadhog", "Tanque", "juego sucio", 15);
		
		// forma correcta
		Personaje tanque = new Tanque("Roadhog", "Tanque", "juego sucio", 15);
		Personaje daño = new Daño("Cassidy", "Daño", "sin perdon", 18);
		Personaje daño2 = new Daño("Ashe", "Daño", "BOB", 25);
		Personaje apoyo = new Apoyo("Mercy", "Apoyo", "valkiria", 18);
		Personaje apoyo2 = new Apoyo("Moira", "Apoyo", "Coalescencia", 20);

		System.out.println("el equipo Overwatch esta compuesto por: ");
		System.out.println("Tanque: " + tanque.getNombre() + " | Ultimates: " + tanque.getUltimate());
		System.out.println("DPS: " + daño.getNombre() + " y " + daño2.getNombre() + " | Ultimates: " + daño.getUltimate() + " / " + daño2.getUltimate());
		System.out.println("Apoyo: " + apoyo.getNombre() + " y " + apoyo2.getNombre() + " | Ultimates: " + apoyo.getUltimate() + " / " + apoyo2.getUltimate());

	}

}
