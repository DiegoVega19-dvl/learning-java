package herencia;

public class Herencia {

	public static void main(String[] args) {

		/*
		 * Empleado empleado1 = new Empleado(); empleado1.getNum_legajo();
		 * empleado1.getNombre(); System.out.println("--------------");
		 * empleado1.setNombre("Juan"); empleado1.setNum_legajo(10);
		 * System.out.println("el nombre del empleado es :" + empleado1.getNombre());
		 * System.out.println("y su numero de alejo es:" + empleado1.getNum_legajo());
		 * 
		 * Consultor consul1 = new Consultor(); consul1.getNombreConsultora();
		 * consul1.getNombre(); System.out.println("--------------");
		 * consul1.setNombreConsultora("Capgemini"); consul1.setDomicilio("Paris");
		 * System.out.println("el nombre de la consultora es: " +
		 * consul1.getNombreConsultora());
		 * System.out.println("y su direccion esta en : " + consul1.getDomicilio());
		 */

		// Polimorfismo
		Persona vector[] = new Persona[5];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		vector[3] = new Jefe();
		
		Consultor consul = new Consultor(1,"jose","romero","pueblo nuevo", "12928192" ,"construtr",23);
		
		System.out.println(consul.getDomicilio());
		System.out.println(consul.getApellido());
		
		}

}
