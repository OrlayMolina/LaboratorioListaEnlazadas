package org.example.laboratorio.ejercicio11;

public class MainEjercicio11 {

    public static void main(String[] args) {

        ListaEnlazada polinomio = new ListaEnlazada();
        polinomio.agregarTermino(1, 2);
        polinomio.agregarTermino(9, 1);
        polinomio.agregarTermino(11, 0);


        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x\tResultado");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double resultado = polinomio.evaluar(x);
            System.out.println(x + "\t" + resultado);
        }
    }
}
