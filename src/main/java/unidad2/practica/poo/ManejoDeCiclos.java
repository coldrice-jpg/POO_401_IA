package unidad2.practica.poo;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        // Conteo Ascendente
        int contadorAsc = 1;
        while (contadorAsc <= 5) {
            System.out.println("Número: " + contadorAsc);
            contadorAsc++;
        }

        System.out.println(); // Espacio para claridad

        // Conteo Descendente
        int contadorDesc = 10;
        do {
            System.out.println("Número: " + contadorDesc);
            contadorDesc--;
        } while (contadorDesc >= 8);

        System.out.println();

        // Tabla de Multiplicar
        System.out.println("--- Tarea 3: Tabla de Multiplicar del 7 (for) ---");
        int numeroTabla = 7;
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }
    }
}