package unidad2.ejercicios.base;

import java.awt.*;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        int notaExamen = 70;

        if (notaExamen >= 60) {
            System.out.println("Felicidades, has aprobado el examen.");

            if (notaExamen >= 90) {
                System.out.println("Excelente desempeño.");
            }

        }
        else {
            System.out.println("Lo sentimos, no has aprobado.");
        }

        // Sentencia switch
        char calificacionLiteral;

        switch (notaExamen) {
            case 100:
            case 90:
                calificacionLiteral = 'A';
                break;
            case 80:
                calificacionLiteral = 'B';
                break;
            case 70:
                calificacionLiteral = 'C';
                break;
            case 60:
                calificacionLiteral = 'D';
                break;
            default:
                calificacionLiteral = 'F';
                break;

        }
        System.out.println("Tienes una " + calificacionLiteral);

    }

}
