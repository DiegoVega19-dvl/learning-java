package objetosConTeclado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("ingresa un nombre: ");
//		String nombre=sc.nextLine();
//		
//		System.out.println("ingresa un edad: ");
//		int edad=sc.nextInt();
//		
//		System.out.println("grado academico: ");
//		String estudios=sc.next();
//		
//		Persona persona = new Persona(nombre,edad,estudios);
//		
//		persona.mostarDatos();

		System.out.println("¿cuantas personas quieres agregar a la lista?");
		int n = sc.nextInt();
		sc.nextLine();

		Persona[] persona = new Persona[n];

		for (int i = 0; i< n; i++) {

			System.out.println("ingresa el nombre de la persona: ");
			String nombre = sc.nextLine();

			System.out.println("ingresa la edad de la persona: ");
			int edad = sc.nextInt();
			sc.nextLine();

			System.out.println("ingresa los estudios de la persona: ");
			String estudios = sc.nextLine();

			persona[i] = new Persona(nombre, edad, estudios);

		}

		System.out.println("lista de personas: ");
		for (Persona p : persona) {
			p.mostarDatos();
		}

		sc.close();
	}

}
