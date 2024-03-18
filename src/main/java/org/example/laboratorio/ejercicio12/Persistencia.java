package org.example.laboratorio.ejercicio12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Persistencia {

    public static final String RUTA_ARCHIVO_NUMEROS_REALES = "src/main/java/org/example/laboratorio/ejercicio12/numeros-reales.txt";

    public static void cargarDatosArchivos(ListaSimple<Integer> listaprocesada) throws FileNotFoundException, IOException {
        ListaSimple<Integer> numerosReales = cargarNumerosReales();
        if (!numerosReales.estaVacia()) {
            listaprocesada.putAll(numerosReales);
        }
    }

    public static ListaSimple<Integer> cargarNumerosReales() throws FileNotFoundException, IOException {
        ListaSimple<Integer> numerosReales = new ListaSimple<>();
        ListaSimple<Integer> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_NUMEROS_REALES);
        for (Integer numero : contenido) {
            numerosReales.agregarInicio(numero);
        }
        return numerosReales;
    }
}
