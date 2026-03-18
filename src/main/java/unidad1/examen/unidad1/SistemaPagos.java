package main.java.unidad1.examen.unidad1;

// Creacion de la clase abstracta
public abstract class SistemaPagos {

    private final double montoAPagar;

    public SistemaPagos(double montoAPagar){
        this.montoAPagar = montoAPagar;

    }

    // Getter
    public double getMontoAPagar() {
        return montoAPagar;
    }

    // Metodo abstracto
    public abstract void procesarPago();

}
