package objetosConTeclado;

public class Persona {

	private String nombre;
	private int edad;
	private String estudios;

	public Persona() {

	}

	public Persona(String nombre, int edad, String estudios) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estudios = estudios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public void mostarDatos() {
		System.out.println("el nombre de la persona es: " + nombre + ", tiene " + edad + " y es " + estudios);
	}

}
