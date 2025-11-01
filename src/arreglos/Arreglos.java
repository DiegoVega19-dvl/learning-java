package arreglos;

public class Arreglos {

	public static void main(String[] args) {

		/*
		 * declaracion de un arreglo int[] numeros = new int[5]; String[] cadenas = new
		 * String[3];
		 * 
		 * int num[] = { 1, 2, 3, 4 };
		 * 
		 * numeros[0] = 10; numeros[1] = 20; numeros[2] = 30; numeros[3] = 40;
		 * 
		 * cadenas[0] = "Juan"; cadenas[1] = "Ana"; cadenas[2] = "Pedro";
		 * 
		 * String[] frutas = { "manzana", "pera", "coco", "sandia", "papaya" };
		 * 
		 * for (int i = 0; i < frutas.length; i++) { System.out.println(frutas[i]); }
		 */

		int[] arr = new int[2];
		arr[0] = 100;
		arr[1] = 200;

		Carros[] carro = new Carros[5];
		carro[0] = new Carros("Honda", "civic", 2020);
		carro[1] = new Carros("Toyota", "corollac", 2020);
		carro[2] = new Carros("Ford", "fiesta", 2020);
		carro[3] = new Carros("Toyota", "Rav4", 2020);
		carro[4] = new Carros("Honda", "crv", 2020);

		for (int i = 0; i < carro.length; i++) {
			System.out.println(carro[i].getMarca() + " " + carro[i].getModelo() + " " + carro[i].getAño());

		}

	}

}
