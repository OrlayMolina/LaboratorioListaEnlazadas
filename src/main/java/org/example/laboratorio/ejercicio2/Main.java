package org.example.laboratorio.ejercicio2;

public class Main {
    public static void main(String[] args) {
        LinkedListSimple personas = new LinkedListSimple();

        personas.agregarPrimero(new Persona("1044102024", "Juan Carlos"));
        personas.agregarPrimero(new Persona("102035", "Jose Luis"));
        personas.agregarPrimero(new Persona("1234567890", "Pedro"));
        personas.agregarPrimero(new Persona("987654321", "María"));


        personas.imprimirPersonasCedulaImpar(personas);

    }
}
