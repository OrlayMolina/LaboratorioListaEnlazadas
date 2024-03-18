package org.example.laboratorio.ejercicio4;

public class Main {
    public static void main(String[] args) {
            ListaSimple<Integer> listaNumeros = new ListaSimple<>();
            listaNumeros.agregarInicio(1);
            listaNumeros.agregarInicio(2);
            listaNumeros.agregarInicio(3);
            listaNumeros.agregarInicio(4);
            listaNumeros.agregarInicio(5);
            listaNumeros.agregarInicio(6);
            listaNumeros.agregarInicio(7);
            listaNumeros.agregarInicio(8);
            listaNumeros.agregarInicio(9);
            listaNumeros.agregarInicio(10);

            System.out.println("Lista original:");
            listaNumeros.imprimirLista();

            System.out.println();

            ListaSimple<Integer> listaImpares = listaNumeros.obtenerNumerosImpares();
            System.out.println();
            System.out.println("\nLista de números impares:");
            listaImpares.imprimirLista();


    }


}
