package unidad2.abstraccion.sensores;

public class SensorVision extends SensorIA {

    @Override
    public void leerDatos() {
        System.out.println("Capturando frame... Ejecutando segmentación semántica de objetos.");
    }
}
