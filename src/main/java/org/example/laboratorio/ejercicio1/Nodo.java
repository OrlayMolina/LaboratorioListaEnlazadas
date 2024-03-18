package org.example.laboratorio.ejercicio1;

public class Nodo {
    private int dato;
    private Nodo next;// en este momento next vale null


    /**
     *
     * @param dato
     */
    public Nodo(int dato) {
        this.dato=dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}

