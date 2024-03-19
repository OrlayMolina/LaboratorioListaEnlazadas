package org.example.laboratorio.ejercicio6_1;

public class MainEjercicio6_1 {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        System.out.println("Lista hacia atrás:");
        lista.imprimirHaciaAtras();
    }
}

