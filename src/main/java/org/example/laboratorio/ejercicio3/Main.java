package org.example.laboratorio.ejercicio3;

public class Main {
    public static void main(String[] args) {
        LinkedListSimple numeros = new LinkedListSimple();
        numeros.agregarPrimero(3);
        numeros.agregarPrimero(4);
        numeros.agregarPrimero(5);
        numeros.agregarPrimero(6);
        numeros.agregarPrimero(7);

        numeros.eliminarNumerosPares();

        // Imprimo
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
