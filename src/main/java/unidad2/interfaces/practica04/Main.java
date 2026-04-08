package unidad2.interfaces.practica04;

public class Main {

    public static void main(String[] args) {

        EjemploCargaMetodos carga = new EjemploCargaMetodos();

        Dataset[] datasets = new Dataset[5];
        int epoca = 1;

        carga.entrenar(datasets, epoca);
        carga.entrenar(datasets);

    }

}
