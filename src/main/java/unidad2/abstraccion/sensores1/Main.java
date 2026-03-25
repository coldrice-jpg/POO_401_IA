package unidad2.abstraccion.sensores1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHD = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar();
        SensorLidar obj2 = new SensorLidar();
        SensorVision obj3 = new SensorVision();
        SensorVision obj4 = new SensorVision();
        SensorUltrasonido obj5 = new SensorUltrasonido();
        SensorUltrasonido obj6 = new SensorUltrasonido();


        percepcionHD.add(obj1);
        percepcionHD.add(obj2);
        percepcionHD.add(obj3);
        percepcionHD.add(obj4);
        percepcionHD.add(obj5);
        percepcionHD.add(obj6);

        for (SensorIA f : percepcionHD){
            f.leerDatos();
        }

    }

}
