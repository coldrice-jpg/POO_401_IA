package unidad2.practica.paradigma.clases.juego;

public class Main {
    public static void main(String[] args) {

        Guerrero arturo = new Guerrero("Arturo");
        Mago merlin = new Mago("Merlín");

        System.out.println("¡Comienza la batalla!");

        arturo.atacar();
        merlin.atacar();
    }
}
