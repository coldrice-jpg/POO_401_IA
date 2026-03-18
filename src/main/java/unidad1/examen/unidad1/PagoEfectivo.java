package main.java.unidad1.examen.unidad1;

// En esta clase tambien aplicamos herencia
public class PagoEfectivo extends SistemaPagos {

    public PagoEfectivo(double montoAPagar) {
        super(montoAPagar);
    }
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo...");
    }
}
