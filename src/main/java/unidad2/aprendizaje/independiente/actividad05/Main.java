package unidad2.aprendizaje.independiente.actividad05;

public class Main {

    public static void main(String[] args) {
        PuedeVolar[] voladores = new PuedeVolar[2];
        voladores[0] = new Avion();
        voladores[1] = new Pajaro();

        for (PuedeVolar v : voladores) {
            v.volar();
        }
    }

}
