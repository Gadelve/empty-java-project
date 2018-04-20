package com.teaching.android;

public class MatrizArrays {

    public static void main(String[] args) {
        int size = 3;
        int[][] matriz = new int[size][size];
        int[] vector = {3, 2, 1, 1, 2, 3, 2, 3, 1};                     // no hace falta new porque definimos nosotros los valores

        //INICIALIZAR
        int indice = 0;                                                 // es 0 porque los indices de los arrays empiezan en 0 y van creciendo de forma exponencial
        for (int i = 0; i < matriz.length; i++) {                       // para recorrer las filas de la matriz
            for (int j = 0; j < matriz.length; j++) {
                //ASIGNAR A LA POSICIÇON DE LA MATRIZ
                matriz[i][j] = vector[indice];
                indice++;
            }
        }
        System.out.println(matriz);

        //MOSTRAR POR CONSOLA

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");                   // RECORDATORIO : con println hace el salto de línea
            }
            System.out.println();
        }

    }
}