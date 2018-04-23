package com.teaching.android;

public class MatrizPractica5 {
    public static void main(String[] args) {
        int size = 3;
        int[] vector1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int[] vector2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};

        //CREAR E INICIALIZAR LAS 2 MATRICES

        Matriz m = new Matriz(size);
        m.asignarDatos(vector1);

        Matriz m2 = new Matriz(size);
        m2.asignarDatos(vector2);


        // MOSTRAMOS LAS MATRICES POR CONSOLA

        System.out.println("Mostrando la primera matriz \n");
        m.mostrar();
        System.out.println();
        System.out.println("Mostrando la segunda matriz \n");
        m2.mostrar();
        System.out.println();

        // PRODUCTO Y SUMA DE LAS MATRICES

        System.out.println("Producto de las matrices \n");


        m.producto(m2);
        m.mostrar();

        System.out.println();

        System.out.println("Suma de las matrices \n");

        m.suma(m2);
        m.mostrar();
    }
}
