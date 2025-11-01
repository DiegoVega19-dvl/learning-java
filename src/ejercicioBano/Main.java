package ejercicioBano;

public class Main {
	public static void main(String[] args) {
		Bano banoCompartido = new Bano();

		for (int i = 1; i <= 2; i++) {
			Persona p = new Persona("Persona-" + i, banoCompartido);
			p.start();
		}
	}
}
