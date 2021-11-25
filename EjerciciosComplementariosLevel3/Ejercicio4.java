/*
4. Se dispone de una lista de Integer, de la cual queremos 
obtener otra lista aplicando la operación de factorial pero 
no se desean valores repetidos.
*/
package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main( String[] args ) {
        List<Integer> nros = List.of(1, 2, 4, 4, 4);
        List<Integer> nrosFactorial = new ArrayList<>();
        nros.stream().collect(Collectors.toSet()).forEach(x -> nrosFactorial.add(factorial(x)));
        System.out.println(nrosFactorial); 
     }
     public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
           fact *= i;
        }
        return fact;
    }
}