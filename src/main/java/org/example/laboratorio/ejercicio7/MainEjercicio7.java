package org.example.laboratorio.ejercicio7;

/*
 *Ejercicio 7. Escribir el Iterador para una lista doblemente enlazada.
 */

// Clase Main para probar el iterador
class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        // Iterar la lista e imprimir los elementos
        System.out.println("Iterando la lista:");
        for (int elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
