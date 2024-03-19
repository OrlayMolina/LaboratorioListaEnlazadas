package org.example.laboratorio.ejercicio6_1;

// Clase ListaDoblementeEnlazada: representa una lista doblemente enlazada
public class ListaDoblementeEnlazada {
    Nodo cabeza;    // Referencia al primer nodo de la lista
    Nodo cola;      // Referencia al último nodo de la lista

    // Constructor de la clase ListaDoblementeEnlazada
    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para imprimir los elementos de la lista hacia atrás
    public void imprimirHaciaAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    // Método para insertar un elemento al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }
}