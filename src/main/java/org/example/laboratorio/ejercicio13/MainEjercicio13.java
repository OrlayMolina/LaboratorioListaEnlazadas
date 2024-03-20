package org.example.laboratorio.ejercicio13;

// Método main para probar el algoritmo

class MainEjercicio13{
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inicio = new NodoLista(1, new NodoLista(2, new NodoLista(3, new NodoLista(4, new NodoLista(5, null)))));

        int clave = 3;
        int maxDistancia = lista.maxDistancia(clave);
        System.out.println("La máxima distancia entre dos elementos con clave " + clave + " es: " + maxDistancia);
    }
}
