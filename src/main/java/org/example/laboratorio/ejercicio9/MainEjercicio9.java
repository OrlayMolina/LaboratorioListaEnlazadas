package org.example.laboratorio.ejercicio9;

import java.util.Scanner;

public class MainEjercicio9 {

    public static void main(String[] args) {
        ListaCircular<Object> objetos = new ListaCircular<>();
        objetos.add("Perro");
        objetos.add("4");
        objetos.add("Esqueleto");
        objetos.add("23");
        objetos.add("5");
        objetos.add("Perro");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el objeto que desea buscar:");
        Object objetoBuscado = scanner.nextLine();

        if (objetos.search(objetoBuscado)) {
            System.out.println("Se encontró el objeto");
        } else {
            System.out.println("No se encontró el objeto");
        }
    }
}
