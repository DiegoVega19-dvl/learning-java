package ejercicioBano;

import java.util.concurrent.atomic.AtomicBoolean;

public class Bano {

	private AtomicBoolean ocupado = new AtomicBoolean(false);

	public void entrar(String nombre) {
		System.out.println(">> " + nombre + " quiere entrar al baño.");

		while (!ocupado.compareAndSet(false, true)) {

		}

		System.out.println(nombre + " ha entrado al baño.");

	}

	public void salir(String nombre) {
		System.out.println(nombre + " ha salido del baño.");
		ocupado.set(false);
	}
}
