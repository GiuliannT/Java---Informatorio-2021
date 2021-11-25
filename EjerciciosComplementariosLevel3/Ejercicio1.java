/*
1. Dada una lista que contiene valores de tipo String, 
se deberá filtrar todos los valores que NO sean null o vacío ("").
*/
package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        System.out.println(
            palabras.stream()
            .filter(x -> x!=null)
            .filter(x -> x!="")
            .collect(Collectors.toList())
        );
    }
}