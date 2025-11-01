package herencia;

public class Consultor extends Persona {

	String nombreConsultora;
	int num_consultora;

	public Consultor() {

	}

	public Consultor(int id, String nombre, String apellido, String domicilio, String telefono, String nombreConsultora,
			int num_consultora) {
		super(id, nombre, apellido, domicilio, telefono);
		this.nombreConsultora = nombreConsultora;
		this.num_consultora = num_consultora;
	}

	public String getNombreConsultora() {
		return nombreConsultora;
	}

	public void setNombreConsultora(String nombreConsultora) {
		this.nombreConsultora = nombreConsultora;
	}

	public int getNum_consultora() {
		return num_consultora;
	}

	public void setNum_consultora(int num_consultora) {
		this.num_consultora = num_consultora;
	}
	
	public void numero() {
		System.out.println("hola mundo");
	}
	

}
