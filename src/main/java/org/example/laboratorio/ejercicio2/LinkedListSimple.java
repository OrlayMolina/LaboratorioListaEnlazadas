package org.example.laboratorio.ejercicio2;


import java.util.ArrayList;
import java.util.List;

public class LinkedListSimple {

    private int size;
    private Nodo primero;

    public LinkedListSimple() {
        size = 0;
    }

    public void agregarPrimero(Persona persona) {
        Nodo nodo = new Nodo(persona);
        if (isEmpty()) {
            primero = nodo;
        } else {
            nodo.setNext(primero);
            primero = nodo;
        }
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Persona get(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Indice NO VALIDO, DE ACUERDO A LIMITES ESTABLECIDOS");
        }
        Nodo auxiliar = primero;
        int indiceAuxiliar = 0;
        while (indiceAuxiliar < indice) {
            auxiliar = auxiliar.getNext();
            indiceAuxiliar++;
        }
        return auxiliar.getDato();
    }

    public List<Persona> obtenerPersonasCedulaImpar(LinkedListSimple personas) {
        List<Persona> personasCedulaImpar = new ArrayList<>();
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            Persona persona = (Persona) auxiliar.getDato();
            String numeroIdentificacion = persona.getNumeroIdentificacion();
            if (numeroIdentificacion.length() % 2 != 0) {
                personasCedulaImpar.add(persona);
            }
            auxiliar = auxiliar.getNext();
        }
        return personasCedulaImpar;
    }

    public void imprimirPersonasCedulaImpar(LinkedListSimple personas) {

        List<Persona> personasCedulaPar = obtenerPersonasCedulaImpar(personas);
        System.out.println("Personas con cantidad par de números en su identificación:");
        for (Persona persona : personasCedulaPar) {
            System.out.println(persona.getNombre() + " - " + persona.getNumeroIdentificacion());
        }
    }

}
