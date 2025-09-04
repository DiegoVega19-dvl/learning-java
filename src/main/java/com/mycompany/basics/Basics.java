/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.basics;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Basics {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("hola mundo ");

        int[] numerosPares = {2, 4, 6, 8};
        System.out.println(numerosPares[1]);
        
        int[] ordenarNumeros = {2,6,3,8,0,3,5};
        Arrays.sort(ordenarNumeros);
        System.out.println(Arrays.toString(ordenarNumeros));
        
    }
}
