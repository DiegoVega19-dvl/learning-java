package basics;

import java.util.Scanner;
import java.util.InputMismatchException;

public class menuOperaciones {
	
	public static void main(String[] args) {
	
	try {
	System.out.println("Hola Bienvenido al menu de operaciones");
	System.out.println("1.- sumar");
	System.out.println("2.- restar");
	System.out.println("3.- multiplicar");
	System.out.println("4.- dividir");
	
	
	System.out.println("elije una opcion: ");
	
	Scanner sc = new Scanner(System.in);
	
	int opcion = sc.nextInt();
	
	switch(opcion) {
	case 1:
		System.out.println("ingresa un numero: ");
		int sum = sc.nextInt();
		
		System.out.println("ingresa un segundo numero: ");
		int sum2 = sc.nextInt();
		
		int suma = sum + sum2;
		System.out.println("el resultado de la suma es: " + suma);
		break;
		
	case 2:
		System.out.println("ingresa un numero: ");
		int res = sc.nextInt();
		
		System.out.println("ingresa un segundo numero: ");
		int res2 = sc.nextInt();
		
		int resta = res - res2;
		System.out.println("el resultado de la resta es: " + resta);
		break;
		
	case 3:
		System.out.println("ingresa un numero: ");
		int mul = sc.nextInt();
		
		System.out.println("ingresa un segundo numero: ");
		int mul2 = sc.nextInt();
		
		int multiplicacion = mul * mul2;
		System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
		break;
		
	case 4:
		System.out.println("ingresa un numero: ");
		int div = sc.nextInt();
		
		System.out.println("ingresa un segundo numero: ");
		int div2 = sc.nextInt();
		
		double division = div / div2;
		System.out.println("el resultado de la division es: " + division);
		break;
		
	default:
		System.out.println("ingresa un numero entre el 1 y el 4");
		
			}
		
		
	sc.close();
		
		}catch(InputMismatchException  ex){
			System.out.println("ingresaste un numero no valido");
			
		}
	}
	
}


