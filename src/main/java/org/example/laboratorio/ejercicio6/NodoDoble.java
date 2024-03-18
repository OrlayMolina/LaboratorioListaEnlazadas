package org.example.laboratorio.ejercicio6;

public class NodoDoble<T> {

    private T valor;
    private NodoDoble<T> anterior;
    private NodoDoble<T> siguiente;

    public NodoDoble(T valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
}
