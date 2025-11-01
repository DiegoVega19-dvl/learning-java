package overwatch2;

public abstract class Personaje {

	private String nombre;
	private String skin;

	public Personaje(String nombre, String skin) {
		this.nombre = nombre;
		this.skin = skin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public abstract String saltar();

	public abstract String agacharse();

	public abstract String moverse();

	public abstract String mirar();

	public abstract String ultimate();

}
