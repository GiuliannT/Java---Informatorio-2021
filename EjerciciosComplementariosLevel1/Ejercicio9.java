/*
9. Dado un String de entrada (frase, texto, etc) calcular 
la cantidad de veces que aparece una letra dada.
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        recorrerString();
    }

    public static void recorrerString(){

        Scanner scan = new Scanner(System.in);
        String fraseIngresada = scan.nextLine();
        String letraIngresada = scan.nextLine();
        scan.close();
        
        String str = fraseIngresada;
        int contador = 0;

        for (int i = 0; i < str.length(); i++){
            char aChar = str.charAt(i);     
            if (aChar == letraIngresada.charAt(0)) {
                contador += 1;
            }   
        }
        System.out.println(contador);
    }
}
