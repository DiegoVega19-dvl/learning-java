package practica5;


public class Main {

	public static void main(String[] args) {
		
		

		Figura[] figura = new Figura[5];

		figura[0] = new Rectangulo(12, 14);
		figura[1] = new Triangulo(32, 45);
		figura[2] = new Rectangulo(12, 67);
		figura[3] = new Triangulo(87, 22);
		figura[4] = new Rectangulo(31, 9);
		
		
		for(int i =0; i < figura.length; i++) {
			System.out.println("la figura es un " + figura[i].getClass().getSimpleName() + " y su area es: " + figura[i].calcularArea());
			
			
			// .getClass().getSimpleName() estos metodos sirven para obtener el nombre del objeto que se esta creando
			
		}
	}

}
