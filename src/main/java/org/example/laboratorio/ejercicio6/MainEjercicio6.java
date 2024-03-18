package org.example.laboratorio.ejercicio6;

public class MainEjercicio6 {

    public static void main(String[] args) {
        // Creamos una instancia de ListaDoble
        ListaDoble<Integer> lista = new ListaDoble<>();

        // Agregamos algunos valores al inicio de la lista
        lista.agregarInicio(6);
        lista.agregarInicio(7);
        lista.agregarInicio(8);
        lista.agregarInicio(9);
        lista.agregarInicio(10);
        // Agregamos algunos valores al final de la lista
        lista.agregarAlFinal(11);
        lista.agregarAlFinal(12);
        lista.agregarAlFinal(13);
        lista.agregarAlFinal(14);
        lista.agregarAlFinal(15);



        // Imprimimos la lista hacia atrás
        System.out.println("Lista hacia atrás:");
        lista.imprimirHaciaAtras();
    }
}
