package herencia;

public class Jefe extends Persona {

	int id_jefe;
	String departementoJefe;

	public Jefe() {

	}

	public Jefe(int id_jefe, String departementoJefe, int id, String nombre, String apellido, String domicilio,
			String telefono) {
		super(id, nombre, apellido, domicilio, telefono);
		this.id_jefe = id_jefe;
		this.departementoJefe = departementoJefe;
	}

	public int getId_jefe() {
		return id_jefe;
	}

	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}

	public String getDepartementoJefe() {
		return departementoJefe;
	}

	public void setDepartementoJefe(String departementoJefe) {
		this.departementoJefe = departementoJefe;
	}

}
