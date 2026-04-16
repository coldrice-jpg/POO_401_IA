package unidad2.practica.paradigma.tareas.dispositivos;

public class Main {

    public static void main(String[] args) {

        Encendible[] dispositivos = new Encendible[2];
        dispositivos[0] = new Tv();
        dispositivos[1] = new Bombilla();

        System.out.println("Probando dispositivos encendibles");

        for (Encendible d : dispositivos) {
            d.encender();
            d.apagar();
        }
    }
}


