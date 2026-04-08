package unidad2.practica01.abstraccion.sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

    List<SensorIA> percepcionHub = new ArrayList<>();

    percepcionHub.add(new SensorLidar());
    percepcionHub.add(new SensorVision());
    percepcionHub.add(new SensorUltrasonido());

    for (SensorIA f : percepcionHub){
        f.leerDatos();
    }

    }

}
