/*
1. Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nombreIngresado = scan.nextLine();
        scan.close();
        System.out.println("Hola " + nombreIngresado);
        
    }
    
    
}