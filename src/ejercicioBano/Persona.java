package ejercicioBano;

public class Persona extends Thread {
	private Bano bano;

	public Persona(String nombre, Bano bano) {
		super(nombre);
		this.bano = bano;
	}

	@Override
	public void run() {
		bano.entrar(getName());

		try {
			System.out.println("   (" + getName() + " está usando el baño...)");
			Thread.sleep((long) (Math.random() * 3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		bano.salir(getName());
	}
}
