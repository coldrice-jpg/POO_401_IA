package unidad2.interfaces.practica05;

import java.util.Scanner;

public class ProcesadorListas {

    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Sandia", "Pera", "Tomate"};

        for (int i = 0 ; i < frutas.length; i++ ) {
            System.out.println("Frutas " + frutas[i]);
        }

        int contador = 1;
        boolean bandera = true;

        while (contador < frutas.length) {
            if (frutas[contador].contains("P")) {
                System.out.println("Fruta encontrada " + frutas[contador]);
                break;
            }
            contador++;

        }

        Scanner cs = new Scanner(System.in);


    }

}
