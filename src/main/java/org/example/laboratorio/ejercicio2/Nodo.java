package org.example.laboratorio.ejercicio2;

public class Nodo {
    private Persona dato;
    private Nodo next;// en este momento next vale null


    /**
     *
     * @param dato
     */
    public Nodo(Persona dato) {

        this.dato=dato;
    }

    public Persona getDato() {

        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
