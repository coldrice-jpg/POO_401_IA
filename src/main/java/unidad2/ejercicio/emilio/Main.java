package unidad2.ejercicio.emilio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Circulo"));
        figuras.add(new Rectangulo("Rectangulo"));

        for (FiguraGeometrica f : figuras) {
            f.mostrarNombre();
            f.calcularArea();
        }


    }

}
