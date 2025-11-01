package practica3;

public class Main {

	public static void main(String[] args) {

		Estudiante alu = new Estudiante("Juan", 15, 6);
		Estudiante alu2 = new Estudiante("Pedro", 15, 4);
		Estudiante alu3 = new Estudiante("Ana", 15, 8);

		System.out.println("el primer estudiante se llama: " + alu.getNombre());
		System.out.println("tiene: " + alu.getEdad() + " Años");
		System.out.println(alu.aprobo(6));

		System.out.println("-------------------");

		System.out.println("el primer estudiante se llama: " + alu2.getNombre());
		System.out.println("tiene: " + alu2.getEdad() + " Años");
		System.out.println(alu2.aprobo(4));

		System.out.println("-------------------");

		System.out.println("el primer estudiante se llama: " + alu3.getNombre());
		System.out.println("tiene: " + alu3.getEdad() + " Años");
		System.out.println(alu3.aprobo(8));

	}

}
