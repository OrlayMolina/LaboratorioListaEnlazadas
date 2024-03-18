package org.example.laboratorio.ejercicio9;

public class Nodo <E> {
    private E dato;
    private Nodo <E> next;

    public Nodo(E data) {
        this.dato = data;
        this.next = null;
    }

    public E getDato() {
        return dato;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }

    public void addToEnd(E value) {
        Nodo<E> newNodo = new Nodo<>(value);
        if (this.next == null) {
            this.next = newNodo;
            newNodo.setNext(this);
        } else {
            Nodo<E> current = this.next;
            while (current.getNext() != this) {
                current = current.getNext();
            }
            current.setNext(newNodo);
            newNodo.setNext(this);
        }
    }

    public boolean search(E searchedValue) {
        Nodo<E> current = this;
        do {
            if (current.getDato().equals(searchedValue)) {
                return true;
            }
            current = current.getNext();
        } while (current != this);
        return false;
    }
}
