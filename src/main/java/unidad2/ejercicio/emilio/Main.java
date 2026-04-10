package unidad2.ejercicio.emilio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(12));
        figuras.add(new Rectangulo(15, 4));

        for (FiguraGeometrica f : figuras) {
            f.mostrarNombre();
            System.out.println(f.calcularArea());
        }


    }

}
