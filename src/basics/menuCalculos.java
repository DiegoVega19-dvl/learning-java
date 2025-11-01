package basics;

import java.util.Scanner;

public class menuCalculos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hola bienvenido elige una opcion para hacer un calculo");
		System.out.println("1.- calcular el area del circulo");
		System.out.println("2.- calcular el factorial de un numero");
		System.out.println("3.- imprimir la tabla de multiplicar de un numero");
		int calculo = sc.nextInt();

		switch (calculo) {
		case 1:
			System.out.println("elegiste el area del circulo");
			double pi = 3.1416;
			System.out.println("ingresa el valor del radio del circulo");
			int r = sc.nextInt();

			double area = (pi * r);
			double total = area * 2;

			System.out.println("el area del circulo es: " + total);

		case 2:
			System.out.println("elegiste calcular el factorial de un numero");
			System.out.println("ingresa un numero");
			int n = sc.nextInt();

			if (n == 0) {
				System.out.println("el factoria de 0 es 1");
			} else {
				if (n != 0) {
					int factorial = 1;
					for (int i = 1; i <= n; i++) {
						factorial = factorial * i;
						System.out.println(factorial);
					}

				}
			}
		case 3:
			System.out.println("elegiste la tablas de multiplicar de un numero");
			System.out.println("ingresa un numero");
			int num = sc.nextInt();
			int tabla = 0;

			for (int i = 0; i < 11; i++) {
				tabla = num * i;
				System.out.println(num + " X " + i + " = " + tabla);

			}

		}

		sc.close();

	}

}
