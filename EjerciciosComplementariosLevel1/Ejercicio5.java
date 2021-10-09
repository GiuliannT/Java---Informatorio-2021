/*
5. Se desea una aplicación que solicite 2 números enteros y realice 
la operación de multiplicación por sumas sucesivas (sin uso de librerías).
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int primerNro = scan.nextInt();
        int segundoNro = scan.nextInt();
        scan.close();

        int resultado = 0;

        for (int i = 0; i < segundoNro; i++) {
            resultado += primerNro;
        }
        System.out.println(primerNro + " x " + segundoNro + " = " + resultado);
    }
}
