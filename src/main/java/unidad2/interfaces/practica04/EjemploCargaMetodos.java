package unidad2.interfaces.practica04;

class Dataset {

}

public class EjemploCargaMetodos {

    public void entrenar (Dataset[] datasets) {
        System.out.println("Metodo entrenar con 1 parametro");

    }

    public void entrenar(Dataset[] datasets, int epoca) {
        System.out.println("Estado entrenar sobrecargado");

    }

}
