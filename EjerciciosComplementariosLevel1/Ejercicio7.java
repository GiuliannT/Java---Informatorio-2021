/*
7. Realizar un programa que dado un String de entrada en minúsculas lo convierta 
por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String stringIngresado = scan.nextLine();
        scan.close();
        
        pasarAMayuscula(stringIngresado);
    }

    public static void pasarAMayuscula(String a){

        String stringTransformado = "";
    
        for (int i = 0; i< a.length(); i++){
    
            char aChar = a.charAt(i);
            if (97 <= aChar && aChar<=122){
                aChar = (char)( (aChar - 32) ); 
            }
            stringTransformado = stringTransformado + aChar;    
        }
        System.out.println(stringTransformado);
    }
    
}
