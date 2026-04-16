package unidad2.practica.poo;

public class ControlAdicional {

    public static void main(String[] args) {

        // Usando break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se alcanzó el 5. Ejecutando break...");
                break;
            }
            System.out.println("Iteración: " + i);
        }

        // Usando continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Número impar encontrado: " + i);
        }

        // Usando return
        int[] misNumeros = {10, 20, 30, 40, 50};
        int objetivo = 30;


        String resultadoBusqueda = encontrarNumero(misNumeros, objetivo);
        System.out.println(resultadoBusqueda);
    }


    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return "¡Éxito! El número " + objetivo + " fue encontrado en la posición " + i + ".";

            }
        }
        return "El número " + objetivo + " no se encuentra en el arreglo.";
    }
}
