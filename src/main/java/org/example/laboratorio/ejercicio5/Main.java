package org.example.laboratorio.ejercicio5;


import java.util.Scanner;

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

        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el valor a a comparar: ");
        Integer numero= teclado.nextInt();
        int repeticiones= listaNumeros.contarNoRepeticiones(numero);
        System.out.println(" La cantidad de veces que se repite el "+ numero+ " es: "+ repeticiones);
    }

}
