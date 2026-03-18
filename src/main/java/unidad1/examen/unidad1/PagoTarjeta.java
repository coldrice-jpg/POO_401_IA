package main.java.unidad1.examen.unidad1;

// En esta clase aplicamos herencia
public class PagoTarjeta extends SistemaPagos {

    public PagoTarjeta (double montoAPagar){
        super(montoAPagar);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta...");

    }
}
