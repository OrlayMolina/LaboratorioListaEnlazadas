package org.example.laboratorio.ejercicio13_1;

public class MainEjercicio13 {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inicio = new NodoLista(2, null);
        lista.inicio.siguiente = new NodoLista(4, null);
        lista.inicio.siguiente.siguiente = new NodoLista(1, null);
        lista.inicio.siguiente.siguiente.siguiente = new NodoLista(4, null);
        lista.inicio.siguiente.siguiente.siguiente.siguiente = new NodoLista(5, null);


        int x = 4;
        int maxDistancia = lista.maximaDistancia(x);
        System.out.println("La máxima distancia entre elementos con la clave " + x + " es: " + maxDistancia);
    }


}
