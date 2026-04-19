package unidad3.listas;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatasetManager {

    public static void main(String[] args) {

        List<String> dataset = new ArrayList<>();
        dataset.add("gato_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("gato_04.jpg");

        System.out.println("data set original " + dataset);

        // Metodo para saber el tamaño de la lista
        System.out.println("Tamaño de la lista (Dataset)" + dataset.size());

        // Saber si la lista contiene un elemento en especifico
        if (dataset.contains("gato_05.jpg")) {
            int index = dataset.indexOf("gato_05.jpg");
            System.out.println("Lo encontro " + index);
            dataset.remove(index);
        }

        // Creacion de una sublista
        List<String> sublista = dataset.subList(0, 3);
        System.out.println("Sublista " + sublista);

        // Para reemplazar un elemento en especifico
        dataset.set(0, dataset.get(0).replace(".jpg", ".tmp"));
        System.out.println("dataSet " + dataset);

        // Metodo clear
        System.out.println("Ultimo elemento " + dataset.get(0));
        dataset.clear();
        System.out.println("Tamaño de la lista actual " + dataset.size());

    }

}
