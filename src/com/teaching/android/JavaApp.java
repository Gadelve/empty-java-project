package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        if (valor%2 != 0){
            System.out.println("El número es impar");
        }
        else
            System.out.println("El número es par");
        }
}


