/*
8. Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nombreApellido = scan.nextLine();
        String edad = scan.nextLine();
        Integer.parseInt(edad);
        String direccion = scan.nextLine();
        String ciudad = scan.nextLine();
        scan.close();
       
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);
    }
}
