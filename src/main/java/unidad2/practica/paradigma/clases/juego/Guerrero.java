package unidad2.practica.paradigma.clases.juego;

public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " blande su espada pesada y realiza un corte crítico.");
    }
}



