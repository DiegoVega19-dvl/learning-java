package poo;

public class Alumno {

	// Atributos

	int id;
	int edad;
	String nombre;
	String grupo;

	// contructor
	public Alumno(int id, int edad, String nombre, String grupo) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.grupo = grupo;

	}

	// setter y getters

	// los getter son para obtener datos de un objeto, por eso tiene la palabra
	// reservada return
	public int getId() {
		return id;
	}

	// los setters sirven para asignar o actualizar los datos de un objeto, por esos
	// tiene los parametros en el parantesis y no regresan nada, por eso tienen el void
	public void setId(int id) {
		this.id = id;
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

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// metodos
	public void saludar() {
		System.out.println("hola");
	}

	public void estudiar() {
		System.out.println("estudiando");

	}

}
