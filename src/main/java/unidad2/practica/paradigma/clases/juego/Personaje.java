package unidad2.practica.paradigma.clases.juego;

public abstract class Personaje {
    String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public abstract void atacar();
}

