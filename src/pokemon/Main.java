package pokemon;

public class Main {

	public static void main(String[] args) {

		Pikachu pika = new Pikachu();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		Bulbasor bulbasor = new Bulbasor();

		System.out.println("pokemon tipo rayo: ");
		pika.ataqueMordisco();
		pika.ataqueTrueno();
		System.out.println("-------------------");
		System.out.println("pokemon tipo fuego: ");
		charmander.ataqueMordisco();
		charmander.lanzaLlamas();
		System.out.println("-------------------");
		System.out.println("pokemon tipo agua: ");
		squirtle.ataqueMordisco();
		squirtle.ataqueBurbuja();
		System.out.println("-------------------");
		System.out.println("pokemon tipo planta: ");
		bulbasor.latigazo();
		bulbasor.ataqueMordisco();

	}

}
