package unidad2.practica.paradigma.tareas.dispositivos;

public class Bombilla implements Encendible {
    @Override
    public void encender() {
        System.out.println("La bombilla calienta el filamento y emite luz cálida.");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla se enfría y deja de emitir luz.");
    }
}

