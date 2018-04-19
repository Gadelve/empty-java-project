package com.teaching.android;

public class Punto {

    // ATRIBUTOS normalmente siempre en privado

    private int x;
    private int y;

    // CONSTRUCTOR/ES

    public Punto() {

    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //GETTERS

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //SETTERS (tiene void porque no tienen que devolver nada, simplemente hacen el cambio de valor

    private void setX() {
        this.x = x;
    }

    private void setY() {
        this.y = y;
    }

    //MÉTODOS

    public double distancia(int pX, int pY) {

        int diferenciaX = pX - x;
        int diferenciaY = pY - y; // Guardamos en una variable la resta de la fórmula

        //AHORA HACEMOS TODAS LAS OPERACIONES QUE CORRESPONDEN CON LA FORMULA MATEMÁTICA

        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);
        return (resultado);
    }

    public double distancia(Punto pDestino) {
        int diferenciaX = pDestino.x - x;
        int diferenciaY = pDestino.y - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);
        return (resultado);
    }

    public String toString() {
        return ("Punto (" + this.x + ", " + this.y + ")");
    }
}