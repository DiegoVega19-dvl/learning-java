package hilosTarea;

import java.util.Random;

public class Hilo {
	public static void main(String[] args) {

		String nombreCompleto = "Juan Diego Vega Romero";

		String[] palabras = nombreCompleto.split(" ");

		for (String palabra : palabras) {
			Thread hilo = new Thread(new PalabraHilo(palabra));
			hilo.start();
		}
	}
}

 class PalabraHilo implements Runnable {
	private String palabra;
	private Random random = new Random();

	public PalabraHilo(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public void run() {
		try {
			int tiempoEspera = random.nextInt(2000);
			Thread.sleep(tiempoEspera);

			System.out.println("Hilo: " + Thread.currentThread().getName() + " → " + palabra);
		} catch (InterruptedException e) {
			System.out.println("El hilo fue interrumpido");
		}
	}
}
