/*
4. Cargar un arrayList con 12 nombres de estudiantes (String), 
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nombresEstudiantes = new ArrayList<String>();
        nombresEstudiantes.add("Juan");
        nombresEstudiantes.add("Lucas");
        nombresEstudiantes.add("Alejandra");
        nombresEstudiantes.add("Tobias");
        nombresEstudiantes.add("Daniel");
        nombresEstudiantes.add("Daniela");
        nombresEstudiantes.add("Sofia");
        nombresEstudiantes.add("Enzo");
        nombresEstudiantes.add("Sebastian");
        nombresEstudiantes.add("Juana");
        nombresEstudiantes.add("Camila");
        nombresEstudiantes.add("Ignacio");

        List<String> cursoUno = nombresEstudiantes.subList(0, 4);
        List<String> cursoDos = nombresEstudiantes.subList(4, 8);
        List<String> cursoTres = nombresEstudiantes.subList(8, 12);

        System.out.println("cursoUno:\n" + cursoUno);
        System.out.println("cursoDos:\n" + cursoDos);
        System.out.println("cursoTres:\n" + cursoTres);

    }
}
