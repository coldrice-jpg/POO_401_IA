package unidad2.practica01.abstraccion.procesadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP {


    @Override
    public Object transformarParaModelo() {
        return null;
    }

    @Override
    public void limpiarTexto() {
        String textoLimpio = getTextoCrudo().replace(".,", " ").replace(",", " ");
        setTextoCrudo(textoLimpio);
    }

    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s")));
        return tokens;
    }
}
