package com.teaching.android;

public class Matriz {

    //Atributos

    private int[][] matriz;
    private int size;

    //CONSTRUCTORES

    public Matriz() {

    }

    public Matriz(int size) {

        matriz = new int[size][size];
        this.size = size;
    }

    //MÉTODOS

    //Inicializar la matriz

    public void asignarDatos(int[] vector) {
        // Índice para recorrer el array de entrada
        int indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = vector[indice];
                indice++;
            }
        }
    }

    public void suma(Matriz m) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = matriz[i][j]+ m.matriz[i][j];
            }
        }
    }

    public void producto(Matriz m) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matriz[i][j]* m.matriz[i][j];
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
