package unidad2.abstraccion.procesadores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String Texto = "El modelo es exelente, es un modelo muy bueno y genial. Tambien es impresionante.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP p : procesadores) {
            System.out.println("\n=== Procesador " + p.getClass().getSimpleName() + "===");
            p.cargarTexto(Texto);
            p.limpiarTexto();
            List<String> tokens = p.tokenizar();
            Object resultado = p.transformarParaModelo();

            System.out.println("Tokens: " + tokens);
            System.out.println("Resultados: " + resultado);

        }



    }

}
