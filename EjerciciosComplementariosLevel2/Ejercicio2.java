/*
2. Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero 
al principio de la lista y otro al final. Por último, iterar e imprimir los elementos 
de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> nros = new ArrayList<>();
        nros.add(1);
        nros.add(2);
        nros.add(3);
        nros.add(4);
        nros.add(5);
        for (Integer integer : nros) {
            System.out.println(integer);
        }
        System.out.println("Tamaño antes: " + nros.size());
        
        nros.add(0, 6);
        nros.add(7);
        for (Integer integer : nros) {
            System.out.println(integer);
        }
        System.out.println("Tamaño despues: " + nros.size());
    }
}
