package basics;

//practica 1 mayor y menor
//resolver el problema de mayor y menor de un par de numeros dados

import java.util.Scanner;

class Ejercicio1 {

	public static void main(String[] args) {

     Scanner lectura = new Scanner(System.in);
     int numero_1, numero_2;

     System.out.println("ingresa el primer numero: ");
     numero_1 = lectura.nextInt();

     System.out.println("ingresa el segundo numero: ");
     numero_2 = lectura.nextInt();

     if (numero_1 > numero_2) {
         System.out.println("el numero mayor es: " + numero_1);
         System.out.println("el numero menor es: " + numero_2);
     } else if (numero_2 > numero_1) {
         System.out.println("el numero mayor es: " + numero_2);
         System.out.println("el numero menor es: " + numero_1);
     } else {
         System.out.println("los numeros son iguales");
     }

     lectura.close();

 }
}
