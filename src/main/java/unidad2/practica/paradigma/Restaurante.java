package unidad2.practica.paradigma;

public class Restaurante {

    String nombre;
    String tipoDeComida;
    int calificacion;

    public void abrir() {
        System.out.println("El restaurante '" + nombre + "' (" + tipoDeComida + ") ahora está ABIERTO.");
    }

    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante();
        rest1.nombre = "La Parroquia";
        rest1.tipoDeComida = "Tradicional Veracruzana";
        rest1.calificacion = 5;

        Restaurante rest2 = new Restaurante();
        rest2.nombre = "Sushi Roll";
        rest2.tipoDeComida = "Japonesa";
        rest2.calificacion = 4;

        System.out.println("Estado de los Restaurantes");
        rest1.abrir();
        rest2.abrir();

        System.out.println("Calificación de " + rest1.nombre + ": " + rest1.calificacion + " estrellas.");
    }
}