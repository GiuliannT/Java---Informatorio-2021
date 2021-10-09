/*
4. Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nroIngresado = scan.nextInt();
        scan.close();

        int factorial = 1;

        for (int i = nroIngresado; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de 5 es: " + factorial);
    }
}
