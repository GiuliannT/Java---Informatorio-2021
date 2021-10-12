/*
5. Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) 
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que 
contenga los totales y luego imprimir el total final a cobrar.
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>(Arrays.asList(350, 345, 550, 600, 320));

        ArrayList<Integer> totales = new ArrayList<Integer>();
        int totalFinal = 0;
        
        if (horasTrabajadas.size() == valorPorHora.size()) {
            for (int i = 0; i < horasTrabajadas.size(); i++) {
                int horasPorValor = horasTrabajadas.get(i) * valorPorHora.get(i);
                totales.add(horasPorValor);
                totalFinal += horasPorValor;
            }
            System.out.println(totales);
            System.out.println("Total Final: $" + totalFinal);
        } else {
            System.out.println("Ingrese misma cantidad de numeros en ambos ArrayList");
        }
    }
}
