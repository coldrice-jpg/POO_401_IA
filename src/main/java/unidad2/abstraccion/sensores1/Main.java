package unidad2.abstraccion.sensores1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHD = new ArrayList<>();

        percepcionHD.add(new SensorLidar());
        percepcionHD.add(new SensorVision());
        percepcionHD.add(new SensorUltrasonido());

        for (SensorIA f : percepcionHD){
            f.leerDatos();
        }

    }

}
