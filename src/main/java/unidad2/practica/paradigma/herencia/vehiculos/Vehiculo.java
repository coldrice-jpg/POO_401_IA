package unidad2.practica.paradigma.herencia.vehiculos;


public class Vehiculo {
    int velocidad;
    int numLlantas;

    public Vehiculo(int numLlantas) {
        this.numLlantas = numLlantas;
        this.velocidad = 0;
    }

    public void acelerar() {
        this.velocidad += 5;
        System.out.println("El vehículo acelera. Velocidad actual: " + velocidad + " km/h");
    }
}

