package unidad3.tarea.practica04;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }
}