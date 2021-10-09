/*
2. Realizar un programa que solicite por consola 2 números enteros. Para luego 
imprimir el resultado de la suma, resta, multiplicación, división y módulo 
(resto de la división) de ambos números.
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int primerNro = scan.nextInt();
        int segundoNro = scan.nextInt();
        scan.close();
        System.out.println(
            primerNro + " + " + segundoNro + " = " + (primerNro + segundoNro) + "\n" +
            primerNro + " - " + segundoNro + " = " + (primerNro - segundoNro) + "\n" +
            primerNro + " * " + segundoNro + " = " + (primerNro * segundoNro) + "\n" +
            primerNro + " / " + segundoNro + " = " + (primerNro / segundoNro) + "\n" +
            primerNro + " % " + segundoNro + " = " + (primerNro % segundoNro) + "\n"
        );
    }
}
