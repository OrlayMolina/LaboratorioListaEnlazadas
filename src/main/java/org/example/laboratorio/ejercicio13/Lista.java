package org.example.laboratorio.ejercicio13;

public class Lista {
    NodoLista inicio;

    Lista() {
        inicio = null;
    }

    // Método público para calcular la máxima distancia entre dos elementos con la clave dada
    public int maxDistancia(int x) {
        // Inicializamos la variable de distancia máxima como cero
        int[] maxDistancia = {0};
        // Llamamos al método recursivo para calcular la máxima distancia
        maxDistanciaRecursivo(inicio, x, maxDistancia, 0);
        // Retornamos la máxima distancia calculada
        return maxDistancia[0];
    }

    // Método recursivo para calcular la máxima distancia entre dos elementos con la clave dada
    private void maxDistanciaRecursivo(NodoLista nodo, int x, int[] maxDistancia, int distanciaActual) {
        // Caso base: si el nodo es nulo, terminamos la recursión
        if (nodo == null)
            return;

        // Si encontramos el elemento con la clave x, actualizamos la distancia actual a cero
        if (nodo.dato == x)
            distanciaActual = 0;

        // Llamamos recursivamente para el siguiente nodo con una distancia actualizada
        maxDistanciaRecursivo(nodo.sig, x, maxDistancia, distanciaActual + 1);

        // Actualizamos la distancia máxima si la distancia actual es mayor que la distancia máxima
        if (distanciaActual > maxDistancia[0])
            maxDistancia[0] = distanciaActual;
    }
}