/*
2. Dada una lista que contiene números enteros, 
se deberá generar otra lista que contendrá el resultado 
de aplicar la operación de potencia a 2.
*/
package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> nrosEnteros = List.of(1, 2, 3, 4, 5);
        List<Integer> nrosPotencia2 = new ArrayList<>();
        nrosEnteros.stream().forEach(n -> nrosPotencia2.add(n*n));
        System.out.println(nrosPotencia2);
    }
}