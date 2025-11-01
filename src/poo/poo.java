package poo;

public class poo {

	public static void main(String[] args) {

		// objeto vacio
		Coche coche1 = new Coche();

		// objeto coche
		Coche coche2 = new Coche("Toyota", "Corolla", 2018);

		// objeto alumno
		Alumno alum1 = new Alumno(1, 15, "juan", "A");

		System.out.println("la marca del coche 2 es: " + coche2.getMarca());
		System.out.println("el modelo del coche 2 es: " + coche2.getModelo());
		System.out.println("y el año es: " + coche2.getAño());

		coche1.setMarca("Honda");
		coche1.setModelo("Civic");
		coche1.setAño(2020);

		System.out.println("-------------------------");
		System.out.println("la marca del coche 1 es: " + coche1.getMarca());
		System.out.println("el modelo del coche 1 es: " + coche1.getModelo());
		System.out.println("y el año es: " + coche1.getAño());

		// aqui se modifica el valor original del año
		coche2.setAño(2019);
		System.out.println("-------------------------");
		System.out.println("la marca del coche 2 es: " + coche2.getMarca());
		System.out.println("el modelo del coche 2 es: " + coche2.getModelo());
		System.out.println("y el año es: " + coche2.getAño());

		System.out.println("-------------------------------");
		System.out.println("el nombre del alumno es: " + alum1.getNombre());
		System.out.println("tiene: " + alum1.getEdad());
		System.out.println("y es del grupo: " + alum1.getGrupo());

	}

}
