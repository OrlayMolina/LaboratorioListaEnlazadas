package org.example.laboratorio.ejercicio7;


// Clase Nodo que representa un nodo en la lista doblemente enlazada
class Nodo {
    int dato;        // Valor del nodo
    Nodo siguiente;  // Referencia al siguiente nodo
    Nodo anterior;   // Referencia al nodo anterior

    // Constructor de la clase Nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}


