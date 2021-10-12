/*
7. Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si 
es a la vez múltiplo de ambos colocara “FizzBuzz”. 

Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con
 qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        fizzBuzzFuncion(1, 6);
        fizzBuzzFuncion(1, 8);
        fizzBuzzFuncion(4, 2);
    }

    public static void fizzBuzzFuncion(int nro1, int nro2) {

        ArrayList<String> arrayNros = new ArrayList<String>();

        if (nro1 < nro2) {

            for (int i = nro1; i < nro2; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    arrayNros.add("FizzBuzz");
                } else if (i % 2 == 0) {
                    arrayNros.add("Fizz");
                } else if (i % 3 == 0) {
                    arrayNros.add("Buzz");
                } else {
                    arrayNros.add(String.valueOf(i));
                }
            }
            System.out.println(arrayNros);
        } else {
            System.out.println("El primer numero debe ser menor que el segundo");
        }
    }
}
