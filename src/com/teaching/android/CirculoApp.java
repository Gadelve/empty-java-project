package com.teaching.android;

public class CirculoApp {
    public static void main(String[] args) {

        //CREACIÓN CÍRCULO C1

        Circulo c1 = new Circulo(2, 3, 5);

        //MÉTODO 1 CÁLCULO DE ÁREA

        c1.getArea();
        System.out.println("El area del círculo es " + c1.getArea());

        //MÉTODO 3 CÁLCULO DE LA CIRCUNFERENCIA

        c1.getCircumference();
        System.out.println("La circunferencia del ciruclo es " + c1.getCircumference());

        //MÉTODO 3 toString

        System.out.println(c1);
    }
}