package com.teaching.android;

public class JavaAppClasePunto {

    public static void main(String[] args) {
        Punto p1 = new Punto(2, 4);
        Punto p2 = new Punto(3, 5);

        //MÉTODO 1 distancia

        double distancia = p1.distancia(3, 5); // p1 (2,4) p2(3,5) --- lo guardamos en una variable llamada distancia para poder llamarlo de forma mas facil luego
        System.out.println(distancia);

        //MÉTODO 2 distancia2

        double distancia2 = p1.distancia(p2);
        System.out.println(distancia2);

        //MÉTODO 3 toString
        System.out.println(p1);
    }
}
