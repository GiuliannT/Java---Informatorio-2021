/*
3. Se dispone de una lista de Strings, de la cual saber 
la cantidad de valores que comiencen con la letra B (tanto mayúscula 
como minúscula, en ese caso decimos que será ignoreCase).
*/
package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        String str = "";
        for (String palabra : palabras) {
            str += palabra.toUpperCase().charAt(0);
        }
        long empiezanConB = str.chars().filter(x -> x == 'B').count();
        System.out.println(empiezanConB);
    }
}