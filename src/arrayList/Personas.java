package arrayList;

public class Personas {

	public int num;
	public int edad;
	public String nombre;

	public Personas() {

	}

	public Personas(int num, int edad, String nombre) {
		this.num = num;
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
