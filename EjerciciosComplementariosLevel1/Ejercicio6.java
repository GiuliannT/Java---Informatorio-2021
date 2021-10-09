/*
6. Se desea una aplicación que solicite 2 números enteros y 
realice la operación de potencia (sin uso de librerías).
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        int elevado = scan.nextInt();
        scan.close();

        int resultado = 0;

        if (nro != 0 && elevado == 0){
            resultado = 1;
            System.out.println(nro + " elevado a " + elevado + " = " + resultado);
        } else if (nro == 0 && elevado == 0) {
            System.out.println(nro + " elevado a " + elevado + " 'No esta definido' ");
        } else {
            resultado = 1;
            for(int i = 1; i <= elevado; i++){
                resultado = resultado * nro;
            }
            System.out.println(nro + " elevado a " + elevado + " = " + resultado);
        }
    }
}
