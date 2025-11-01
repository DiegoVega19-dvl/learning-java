package basics;

import java.util.Scanner;

public class estructuraWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a while");
		System.out.println("ingresa un numero: ");
		int num = sc.nextInt();

		while (num != 0) {
			System.out.println("esto es un buble while");
			num--;
			
			sc.close();
		}
	}

}
