/*
1. Crear un ArrayList y cargarlo con tus ciudades 
favoritas de Argentina, luego imprimir por pantalla el ranking
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String ciudad1 = scan.nextLine();
        String ciudad2 = scan.nextLine();
        String ciudad3 = scan.nextLine();
        scan.close();

        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add(ciudad1);
        ciudades.add(ciudad2);
        ciudades.add(ciudad3);

        int ranking = 1;
        for (String string : ciudades) {
            System.out.println("#" + ranking + " - " + string);
            ranking += 1;
        }

    }
}
