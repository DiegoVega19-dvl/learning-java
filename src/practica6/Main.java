package practica6;

public class Main {

	public static void main(String[] args) {

		Operaciones[] operacion = new Operaciones[5];

		operacion[0] = new Suma(12, 12);
		operacion[1] = new Resta(34, 11);
		operacion[2] = new Suma(65, 88);
		operacion[3] = new Resta(56, 98);
		operacion[4] = new Suma(122, 22);
		
		
		for (int i = 0; i < operacion.length; i++) {
			System.out.println("la operacion es " + operacion[i].getClass().getSimpleName() + " y su resultado es: " + operacion[i].calcular());
			
		}
		
	}

}
