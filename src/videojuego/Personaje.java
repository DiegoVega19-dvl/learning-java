
// practica de programacion orientada a objetos con el ejemplo de videojuegos

package videojuego;

public abstract class Personaje {

	String nombre;
	String clase;
	String ultimate;
	int nivel;

	public Personaje(String nombre, String clase, String ultimate, int nivel) {
		this.nombre = nombre;
		this.clase = clase;
		this.ultimate = ultimate;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getUltimate() {
		return ultimate;
	}

	public void setUltimate(String ultimate) {
		this.ultimate = ultimate;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public abstract String saltar();

	public abstract String agacharse();

	public abstract String correr();

	public abstract String andar();

	public abstract String usarUlti();

	public abstract String animacion();

}
