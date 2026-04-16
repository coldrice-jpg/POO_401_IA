package unidad3.mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokenOptimizado {

    public static void main(String[] args) {

        // Arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        Map<String, Integer> frecuencia = new HashMap<>();

        for (String t: tokens) {
            // Metodo merge de la interface Map
            // Si te no existe pone 1
            // Si t ya existe, suma el valor anterior + el valor nuevo
            frecuencia.merge(t, 1,
                    (valorAnterior, valorNuevo) -> valorAnterior+valorNuevo);

        }

        System.out.println("--- Frecuencias con el metodo Merge de Map ---");
        frecuencia.forEach((k, v) -> System.out.println(k + ":" + v));

    }


}
