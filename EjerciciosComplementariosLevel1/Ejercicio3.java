/*
3. Confeccionar un programa que dado un número entero como dato de entrada 
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nroIngresado = scan.nextInt();
        scan.close();

        String secuencia = "1";
        for (int i = 2; i < nroIngresado + 2; i++) {
            System.out.println(secuencia);
            secuencia += " " + i;
        }
    }
}
