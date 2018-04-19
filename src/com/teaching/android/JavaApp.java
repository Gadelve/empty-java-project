package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Paco", 100f);
        Persona p2 = new Persona ("Pepe", 500f);

        p1.pagar(p2, 400f);
        /* print del dinero que tienen ahora*/

        System.out.println("Paco tiene" + p2.getDinero());
        System.out.println("Pepe tiene" + p1.getDinero());
    }
}