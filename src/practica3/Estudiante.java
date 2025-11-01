package practica3;

public class Estudiante {

	String nombre;
	int edad;
	double calificacion;

	public Estudiante() {

	}

	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;

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

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public double aprobo(double calificacion) {

		if (calificacion >= 6.0) {
			System.out.println("Aprobado con: ");
		} else {
			System.out.println("Reprobado con: ");
		}

		return calificacion;

	}

}
