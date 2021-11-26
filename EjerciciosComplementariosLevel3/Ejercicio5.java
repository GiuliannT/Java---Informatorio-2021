/*
5 .Se posee una Lista con objetos de clase Alumno con los 
atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). 
Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado 
con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el 
ejemplo y demostrar su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá 
usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
*/
package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Simpson", "Homero", LocalDate.now().minusYears(30)),
            new Alumno("Simpson", "Bart", LocalDate.of(1999, 1, 10)),
            new Alumno("Simpson", "Lisa", LocalDate.of(1995, 5, 15)),
            new Alumno("Simpson", "Maggie", LocalDate.of(2000, 10, 19)),
            new Alumno("Simpson", "Marge", LocalDate.of(2006, 11, 22))
            );
    Map<String,Integer> edadAlumnos = alumnos.stream()
                                .collect(Collectors.toMap(p-> (p.getApellido() + " " + p.getNombre()),
                                    p -> Alumno.getEdad(p.getFechaDeNacimiento())));
    System.out.print(edadAlumnos);
    }
}