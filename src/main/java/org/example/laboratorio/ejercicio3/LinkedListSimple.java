package org.example.laboratorio.ejercicio3;

public class LinkedListSimple {

    private int size;
    private Nodo primero;


    public LinkedListSimple() {
        size = 0;
    }

    public void agregarPrimero(int dato) {
        Nodo newNodo = new Nodo(dato);
        if (isEmpty()) {
            primero = newNodo;
        } else {
            newNodo.setNext(primero);
            primero = newNodo;
        }
        size++;
    }


    private boolean isEmpty() {
        return size == 0;
    }

    public int size() {//metodo creado
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int get(int indice) {//metodo creado
        int dato = 0;
        if (indice < 0 || indice > size) {
            throw new IndexOutOfBoundsException("Indice NO VALIDO, DE ACUERDO A LIMITES ESTABLECIDOS");
        }
        Nodo auxiliar = primero;
        int indiceAuxiliar = 0;


        //Ejemplo iterar con for
        for (int i = 0; i <= indice; i++) {
            if (indiceAuxiliar == indice) {
                dato = auxiliar.getDato();
                return dato;
            }

        }
        // Ejemplo iteracion con while
        while (auxiliar != null) {
            if (indiceAuxiliar == indice) {
                dato = auxiliar.getDato();
                return dato;
            }
            auxiliar = auxiliar.getNext();
            indiceAuxiliar++;
        }
        return dato;
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Indice NO VALIDO, DE ACUERDO A LIMITES ESTABLECIDOS");
        }
        if (indice == 0) {
            primero = primero.getNext();
        } else {
            Nodo auxiliar = primero;
            int indiceAuxiliar = 0;
            while (indiceAuxiliar < indice - 1) {
                auxiliar = auxiliar.getNext();
                indiceAuxiliar++;
            }
            auxiliar.setNext(auxiliar.getNext().getNext());
        }
        size--;
    }

    public void eliminarNumerosPares() {
        Nodo anterior = null;
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato() % 2 == 0) {
                if (anterior == null) {
                    primero = actual.getNext();
                } else {
                    anterior.setNext(actual.getNext());
                }
                size--;
            } else {
                anterior = actual;
            }
            actual = actual.getNext();
        }
    }


}
