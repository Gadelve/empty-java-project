package com.teaching.android;

public class Persona {

    /* ATRIBUTOS */

    private String nombre;
    private float dinero;

    /* CONSTRUCTOR */

public Persona(String nombre, float dinero){
    this.nombre = nombre;  // también se puede: nombre = pNombre;
    this.dinero = dinero;  // también se puede: dinero = pDinero;
}

    /* MÉTODO/S */

    public void pagar(Persona p,float cantidad) {

        this.dinero = this.dinero + cantidad;

        p.dinero = p.dinero - cantidad;
    }

    // Hacemos Getter para poder conocer la información de los atributos sin tener que correr el riesgo de cambiarla

    public float getDinero() {
        return dinero;
    }

    public String getNombre() {
        return nombre;
    }

}
