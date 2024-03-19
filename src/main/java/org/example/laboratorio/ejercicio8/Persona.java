package org.example.laboratorio.ejercicio8;

public class Persona {

    String numeroIdectificacion;
    String nombre;

    public Persona(String numeroIdectificacion, String nombre) {
        this.numeroIdectificacion = numeroIdectificacion;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getNumeroIdentificacion() {
        return numeroIdectificacion;
    }

    public void setNumeroIdentificacion(String numeroIdectificacion) {
        this.numeroIdectificacion = numeroIdectificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Identificación: " + numeroIdectificacion + ", Nombre: " + nombre;
    }
}

