package unidad2.practica01.abstraccion.sensores1;

public class SensorLidar extends SensorIA {

    public SensorLidar(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser." + " " + "Modelo: " + " " + getModelo() + " " + "Consumo de energia: " + " "
        + getConsumoEnergia());

    }
}
