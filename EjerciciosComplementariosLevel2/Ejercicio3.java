/*
3. Crear una lista que contenga como elementos la numeración de cartas de una 
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), 
imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> valorCartas = new ArrayList<Integer>();

        for (int i = 1; i < 14; i++) {
            valorCartas.add(i);
        }
        System.out.println(valorCartas);
        
        Collections.reverse(valorCartas);
        System.out.println(valorCartas);

        Collections.shuffle(valorCartas);
        System.out.println(valorCartas);
    }
}
