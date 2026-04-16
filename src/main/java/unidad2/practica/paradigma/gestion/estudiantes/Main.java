package unidad2.practica.paradigma.gestion.estudiantes;

public class Main {
    public static void main(String[] args) {

        Clase miCurso = new Clase("Programación Orientada a Objetos");

        Estudiante est1 = new Estudiante("Ana García", 1001);
        Estudiante est2 = new Estudiante("Luis Torres", 1002);
        Estudiante est3 = new Estudiante("Sofía López", 1003);

        miCurso.inscribirEstudiante(est1);
        miCurso.inscribirEstudiante(est2);
        miCurso.inscribirEstudiante(est3);

        miCurso.mostrarEstudiantes();
    }
}