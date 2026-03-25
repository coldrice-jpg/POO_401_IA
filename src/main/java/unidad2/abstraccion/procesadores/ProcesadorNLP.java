package unidad2.abstraccion.procesadores;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorNLP {

    private String textoCrudo;

    public void cargarTexto(String texto) {

    }

    protected List<String> tokens = new ArrayList<>();

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public void setTextoCrudo(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }
}
