package main.java.unidad1.examen.unidad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Aqui creamos una lista que acepta cualquier tipo de pago
        List<SistemaPagos> listaDePagos = new ArrayList<>();

        // Aqui agregamos diferentes transacciones
        listaDePagos.add(new PagoTarjeta(150.50));
        listaDePagos.add(new PagoEfectivo(50.00));
        listaDePagos.add(new PagoTarjeta(2100.00));

        // Aqui aplico polimorfismo para procesar los pagos
        for (SistemaPagos p : listaDePagos){
            p.procesarPago();
        }
    }
}