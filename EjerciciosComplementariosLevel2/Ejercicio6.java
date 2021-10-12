/*
6. Se dispone de una lista de Empleados, de cada empleado se conoce:
    -Nombre y Apellido
    -DNI
    -horasTrabajadas
    -valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular 
el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar 
en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

*/

package EjerciciosComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Integer> sueldo = new HashMap<>();

        //empleado.add(new Empleado("Nombre y Apellido", DNI, horasTrabajadas, valorPorHora));
        empleado.add(new Empleado("Juan Abras", 39485295, 161, 20));
        empleado.add(new Empleado("Julieta Muller", 35294056, 145, 18));
        empleado.add(new Empleado("Daniela Salgueira", 41234975, 120, 18));
        empleado.add(new Empleado("Daniel Ortiz", 29301521, 183, 18));
        empleado.add(new Empleado("Angel Fule", 42232452, 179, 25));

        for (Empleado creartabla : empleado) {
            sueldo.put(creartabla.clave(), creartabla.valor());
        }

        sueldo.forEach((dni, valor) -> System.out.println("DNI: " + dni + " -> Sueldo: $" + valor));
    }
}
        class Empleado {
            String nombre;
            int dni;
            int horasTrabajadas;
            int valorHora;
    
            public Empleado(String nombre, int dni, int horasTrabajadas, int valorHora) {
                this.nombre = nombre;
                this.dni = dni;
                this.horasTrabajadas = horasTrabajadas;
                this.valorHora = valorHora;
            }
        
            public int clave() {
                return this.dni;
            }
        
            public int valor() {
                return this.horasTrabajadas * this.valorHora;
            }    
        }