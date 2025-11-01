package basics;

import java.util.Scanner;

public class bucleFor {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int numero = 0;

        System.out.println("ingre un numero cualquiera: ");
        numero = lectura.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println("el numero es: " + i);

        }

        lectura.close();

    }
}

