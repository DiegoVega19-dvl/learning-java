package basics;

//practica del promedio


import java.util.Scanner;

public class Promedio {
	
 public static void main(String[] args) {

     Scanner lectura = new Scanner(System.in);
     int promedio = 0;

     System.out.println("ingresa la calificacion de la materia 1: ");
     int materia_1 = lectura.nextInt();

     System.out.println("ingresa la calificacion de la materia 2: ");
     int materia_2 = lectura.nextInt();

     System.out.println("ingresa la calificacion de la materia 3: ");
     int materia_3 = lectura.nextInt();

     promedio = (materia_1 + materia_2 + materia_3) / 3;

     System.out.println("el promedio final es : " + promedio);

     lectura.close();

 }

}
