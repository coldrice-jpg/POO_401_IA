package unidad2.practica.paradigma.herencia.vehiculos;

public class Automovil extends Vehiculo {
    public Automovil() {
        super(4);
    }

    @Override
    public void acelerar() {
        this.velocidad += 20;
        System.out.println("El automóvil ruge y acelera. Velocidad actual: " + velocidad + " km/h");
    }
}


