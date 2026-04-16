package unidad2.practica.dominio.gestion;

import java.util.Scanner;

public class TrazabilidadPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Ingrese estado actual: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("El pedido está en tránsito. Saltando verificaciones internas...");
                continue;
            }

            if (estado.equalsIgnoreCase("Error en envío")) {
                System.out.println("Proceso abortado debido a un error crítico.");
                break;
            }

            System.out.println("Actualización: El pedido está en estado '" + estado + "'");
        }
    }
}