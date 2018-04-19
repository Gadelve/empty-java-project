package com.teaching.android;

public class Circulo {

    //ATRIBUTOS

    private int radio;
    private Punto centro;

    //CONSTRUCTORES

    public Circulo() {

    }

    public Circulo(int x, int y, int radio) {

        this.centro = new Punto(x, y); //PARA CONSTRUIR EL PUNTO QUE REPRESENTA EL CENTRO DEL CIRCULO Y LO ASIGNAMOS A SU VEZ A LA VARIABLE CENTRO
        this.radio = radio;
    }

    public Circulo(Punto p, int radio) {
        this.centro = p; // Es this.centro porque el punto que se nos pide en el parámetro lo podemos referenciar directamente al centro.
        this.radio = radio;

    }

    //GETTERS

    public int getRadio() {
        return (radio);
    }

    public int getCentro() {
        return (radio);
    }

    //SETTERS

    public void setRadio() {
        this.radio = radio;

    }

    public void setCentro() {
        this.centro = centro;

    }

    //MÉTODOS

    public double getArea() {

        double area = Math.PI * Math.pow(radio, 2);
        return(area);
    }

    public double getCircumference() {

        int diametro = radio * 2;
        double Circumference = Math.PI * diametro;
        return(Circumference);

    }

    public String toString(){

        return ("Círculo con centro en (2, 3) y radio 5");
    }


}
