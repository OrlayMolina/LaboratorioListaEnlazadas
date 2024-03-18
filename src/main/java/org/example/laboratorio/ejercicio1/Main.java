package org.example.laboratorio.ejercicio1;

public class Main {
    public static void main(String[] args) {

        LinkedListSimple numeros = new LinkedListSimple();
        numeros.agregarPrimero(3);
        numeros.agregarPrimero(4);
        numeros.agregarPrimero(5);
        numeros.agregarPrimero(6);
        numeros.agregarPrimero(7);

        numeros.datoPosicionesImpares(numeros);

    }

}
