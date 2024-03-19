package org.example.laboratorio.ejercicio8;

public class Main {
    public static void main(String[] args) {
        ListaDoble<Persona> personas = new ListaDoble<>();

        personas.agregarInicio(new Persona("1044102024", "Juan Carlos"));
        personas.agregarInicio(new Persona("102035", "Jose Luis"));
        personas.agregarInicio(new Persona("1234567890", "Pedro"));
        personas.agregarInicio(new Persona("987654321", "María"));

        ListaDoble<Persona> personasCedulapar = personas.obtenerPersonasCedulaPar();
        personasCedulapar.imprimirLista();
    }

}
