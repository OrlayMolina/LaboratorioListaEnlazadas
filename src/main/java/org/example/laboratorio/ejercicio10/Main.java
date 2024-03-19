package org.example.laboratorio.ejercicio10;

public class Main {
    public static void main(String[] args) {

        ListaDoble<String> lista1 = new ListaDoble<>();
        lista1.agregarfinal("Juan");
        lista1.agregarfinal("María");
        lista1.agregarfinal("Carlos");
        lista1.agregarfinal("Ana");
        lista1.agregarfinal("Pedro");


        ListaDoble<String> lista2 = new ListaDoble<>();
        lista2.agregarfinal("Luis");
        lista2.agregarfinal("Laura");
        lista2.agregarfinal("Roberto");
        lista2.agregarfinal("Sofía");
        lista2.agregarfinal("David");


        ListaDoble<String> listaConcatenada = ListaDoble.concatenarListas(lista1, lista2);

        System.out.println("Lista concatenada:");
        listaConcatenada.imprimirLista();
    }


}
