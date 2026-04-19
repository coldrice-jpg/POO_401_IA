package unidad3.tarea.practica04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Círculo Rojo", 5.0));
        figuras.add(new Rectangulo("Rectángulo Azul", 10.0, 4.0));

        System.out.println("Reporte de Áreas");
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre();
            System.out.printf("El área es: %.2f%n", figura.calcularArea());
        }
    }
}