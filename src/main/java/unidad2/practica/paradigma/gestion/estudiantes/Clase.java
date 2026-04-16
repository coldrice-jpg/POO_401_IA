package unidad2.practica.paradigma.gestion.estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    String nombreDeClase;
    List<Estudiante> listaEstudiantes;

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante est) {
        listaEstudiantes.add(est);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en " + nombreDeClase + ":");
        for (Estudiante e : listaEstudiantes) {
            System.out.println("- " + e.nombre + " (ID: " + e.id + ")");
        }
    }
}

