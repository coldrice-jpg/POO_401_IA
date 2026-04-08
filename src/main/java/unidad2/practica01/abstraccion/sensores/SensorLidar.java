package unidad2.practica01.abstraccion.sensores;

public class SensorLidar extends SensorIA {

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser.");
    }
}
