package herencia;

public class Empleado extends Persona {

	int num_legajo;
	String cargo;
	int sueldo;

	public Empleado() {

	}

	public Empleado(int id, String nombre, String apellido, String domicilio, String telefono, int num_legajo,
		String cargo, int sueldo) {
		super(id, nombre, apellido, domicilio, telefono); // la declarion super sirve heredar los atributos de la clase madre
		this.num_legajo = num_legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getNum_legajo() {
		return num_legajo;
	}  

	public void setNum_legajo(int num_legajo) {
		this.num_legajo = num_legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
