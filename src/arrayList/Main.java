package arrayList;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Personas> lista = new LinkedList<Personas>();

		lista.add(new Personas(1, 25, "Diego"));
		lista.add(new Personas(2, 30, "Luisina"));
		lista.add(new Personas(3, 20, "Alvaro"));
		lista.add(new Personas(4, 24, "Carlos"));
		lista.add(0, new Personas(4, 24, "Maria"));


		// recorrer por indice

		System.out.println("prueba con for clasico");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("prueba: " + lista.get(i).getNombre());
		}

		System.out.println("prueba con foreach");

		// recorrido con foreach

		for (Personas perso : lista) {
			System.out.println("prueba: " + perso.getNombre());
		}

	}

}
