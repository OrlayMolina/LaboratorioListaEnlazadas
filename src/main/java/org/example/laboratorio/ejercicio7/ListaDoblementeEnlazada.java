package org.example.laboratorio.ejercicio7;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Clase que representa una lista doblemente enlazada
public class ListaDoblementeEnlazada implements Iterable<Integer> {
    private Nodo cabeza; // Referencia al primer nodo de la lista
    private Nodo cola;   // Referencia al último nodo de la lista

    // Constructor y otros métodos de la lista...

    // Método para obtener un iterador para recorrer la lista
    @Override
    public Iterator<Integer> iterator() {
        return new ListaDoblementeEnlazadaIterator(cabeza);
    }

    public void insertarAlFinal(int i) {
    }

    // Clase interna para implementar el iterador
    private class ListaDoblementeEnlazadaIterator implements Iterator<Integer> {
        private Nodo actual; // Nodo actual del iterador

        // Constructor del iterador
        public ListaDoblementeEnlazadaIterator(Nodo inicio) {
            actual = inicio;
        }

        // Método para verificar si hay un siguiente elemento
        @Override
        public boolean hasNext() {
            return actual != null;
        }

        // Método para obtener el siguiente elemento
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos en la lista.");
            }
            int dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }
    }    
}
