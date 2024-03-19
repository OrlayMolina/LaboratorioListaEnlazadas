package org.example.laboratorio.ejercicio6_1;

// Clase Nodo: representa un nodo en la lista doblemente enlazada
public class Nodo {
    int dato;           // Valor del nodo
    Nodo siguiente;     // Referencia al siguiente nodo
    Nodo anterior;      // Referencia al nodo anterior

    // Constructor de la clase Nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
