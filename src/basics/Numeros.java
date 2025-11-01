package basics;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("ingresa un numero: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("el numero : " + numero + " es par");
		} else {
			System.out.println("el numero : " + numero + " es impar");
		}

		sc.close();

	}

}
