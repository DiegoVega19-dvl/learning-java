package interfaces;

public class Main {

	public static void main(String[] args) {

		Circulo figura1 = new Circulo(34.45);
		Cuadrado figura2 = new Cuadrado(34.45);
		Circulo figura3 = new Circulo(100.0);
		Cuadrado figura4 = new Cuadrado(200.00);
		
		System.out.println("el primer circulo tiene un area de : " + figura1.calcularArea() + " y su diametro es : " + figura1.calcularDiametro()); 
		System.out.println("el area del primer cuadrado es: " + figura2.calcularArea());
		System.out.println("el segundo circulo tiene un area de : " + figura3.calcularArea() + " y su diametro es : " + figura3.calcularDiametro());
		System.out.println("el area del primer cuadrado es: " + figura4.calcularArea());
	}
}
