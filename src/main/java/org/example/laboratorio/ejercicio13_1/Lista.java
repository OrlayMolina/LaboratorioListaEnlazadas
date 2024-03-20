package org.example.laboratorio.ejercicio13_1;

public class Lista {
    NodoLista inicio;

    public Lista() {
        inicio = null;
    }

    public int maximaDistancia(int x) {
        int[] maximaDistancia = {0};
        maximaDistanciaRecursivo(inicio, x, 0, maximaDistancia);
        return maximaDistancia[0];
    }

    private void maximaDistanciaRecursivo(NodoLista nodoLista, int x, int distanciaActual, int[] maximaDistancia) {

        if (nodoLista == null) {
            return;
        }

        if (nodoLista.dato == x) {
            if (distanciaActual > maximaDistancia[0]) {
                maximaDistancia[0] = distanciaActual;
            }
            distanciaActual = 0;
        } else {
            distanciaActual++;
        }
        maximaDistanciaRecursivo(nodoLista.siguiente, x, distanciaActual, maximaDistancia);
    }
}

