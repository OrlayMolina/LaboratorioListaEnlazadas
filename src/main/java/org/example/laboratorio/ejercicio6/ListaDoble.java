package org.example.laboratorio.ejercicio6;

public class ListaDoble<T> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para agregar al inicio de la lista
    public void agregarInicio(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            // Actualizamos la referencia cola solo si la lista tenía un solo elemento
            if (cabeza.getSiguiente() == null) {
                cola = cabeza;
            }
        }
    }

    public void agregarAlFinal(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }



    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para imprimir la lista hacia atrás
    public void imprimirHaciaAtras() {
        NodoDoble<T> nodoActual = cola;
        while (nodoActual != null) {
            System.out.print(nodoActual.getValor() + "\t");
            nodoActual = nodoActual.getAnterior();
        }
        System.out.println();
    }
}
