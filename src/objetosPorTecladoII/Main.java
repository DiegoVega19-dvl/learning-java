package objetosPorTecladoII;

public class Main {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo(23, 45);
		Cuadrado cuadrado = new Cuadrado(100);
		Circulo circulo = new Circulo(23);

		System.out.println("el area del triangulo es: " + triangulo.calcularArea());
		System.out.println("el area del cuadrado es: " + cuadrado.calcularArea());
		System.out.println("el area del circulo es: " + circulo.calcularArea());
	}

}
