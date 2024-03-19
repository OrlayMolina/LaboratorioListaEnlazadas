package org.example.laboratorio.ejercicio9;

public class ListaCircular <E> {

    private Nodo <E> head;

    public ListaCircular() {
        this.head = null;
    }

    public void add(E value) {
        if (head == null) {
            head = new Nodo(value);
            head.setNext(head);
        } else {
            head.addToEnd(value);
        }
    }

    public boolean search(E searchedValue) {
        if (head == null) {
            return false;
        }
        return head.search(searchedValue);
    }


}

