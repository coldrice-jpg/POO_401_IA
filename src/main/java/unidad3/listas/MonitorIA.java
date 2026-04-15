package unidad3.listas;

import java.util.ArrayList;
import java.util.List;

class MetricaDeEntrenamiento {

    int epoca;
    double loss;
    double accuracy;

    public MetricaDeEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "MetricaDeEntrenamiento{" +
                "epoca=" + epoca +
                ", loss=" + loss +
                ", accuracy=" + accuracy +
                '}';
    }
}

public class MonitorIA {

    public static void main(String[] args) {

        List<MetricaDeEntrenamiento> metrica = new ArrayList<>();

        metrica.add(new MetricaDeEntrenamiento(12, 2, 73.2));
        metrica.add(new MetricaDeEntrenamiento(6, 4, 80));
        metrica.add(new MetricaDeEntrenamiento(8, 3, 65.6));
        metrica.add(new MetricaDeEntrenamiento(4, 1, 84));
        metrica.add(new MetricaDeEntrenamiento(11, 5, 54.46));

        System.out.println("Lista de Metrica de Entrenamiento " + metrica);

        // Imprimir el primer y ultimo elemento

        if (!metrica.isEmpty()) {
            MetricaDeEntrenamiento primero = metrica.get(0);
            MetricaDeEntrenamiento ultimo = metrica.get(metrica.size() - 1);

            System.out.println("\n--- IMPRESION DEL PRIMER Y ULTIMO ELEMENTO ---");

            System.out.println("Primer elemento: " + primero);
            System.out.println("Último elemento: " + ultimo);
        }

            // Eliminar el primer u ultimo elemento


            // Iterar la lista de metricas y detectar el orden de inserccion

        }

    }
