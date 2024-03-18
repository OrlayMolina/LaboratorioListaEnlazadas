package org.example.laboratorio.ejercicio12;

/**
 * 12. Escriba un programa que calcule la media y la desviación estándar de un conjunto de N
 * números reales. Tenga en cuenta que:
 * - Implementar una lista enlazada propia
 * - Debe leer los n números reales de un archivo
 * - Debe almacenar los N números reales en una lista enlazada para realizar los cálculos.
 */
public class MainEjercicio12 {

    public static void main(String[] args) {
        ListaSimple<Integer> listaNumerosReales = new ListaSimple<>();

        try {
            // Cargar datos desde el archivo
            Persistencia.cargarDatosArchivos(listaNumerosReales);

            // Calcular la media y la desviación standard
            double media = listaNumerosReales.calcularMedia();
            double desviacionEstandar = listaNumerosReales.calcularDesviacionEstandar();

            // Imprimir resultados
            System.out.println("Media: " + media);
            System.out.println("Desviación estándar: " + desviacionEstandar);
        } catch (Exception e) {
            System.err.println("Error al procesar los datos: " + e.getMessage());
        }
    }
}
