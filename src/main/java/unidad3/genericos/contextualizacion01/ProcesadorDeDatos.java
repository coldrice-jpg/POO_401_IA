package unidad3.genericos.contextualizacion01;

import java.util.List;
import java.util.Map;

public interface ProcesadorDeDatos<T, K, Y> {

    void procesarSecuencia(List<T> elementos);

    void procesarMapa(Map<K, Y> datosAsociativos);

}

class ProcesadorVision implements ProcesadorDeDatos<String, String, String> {

    @Override
    public void procesarSecuencia(List<String> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, String> datosAsociativos) {

    }
}

// Motor Recomendaciones

class MotorRecomendaciones implements ProcesadorDeDatos<Integer, String, Double> {

    @Override
    public void procesarSecuencia(List<Integer> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, Double> datosAsociativos) {

    }
}

// Prueba Variables
class PruebaVariables implements ProcesadorDeDatos<Double, Integer, Integer> {

    @Override
    public void procesarSecuencia(List<Double> elementos) {

    }

    @Override
    public void procesarMapa(Map<Integer, Integer> datosAsociativos) {

    }
}

