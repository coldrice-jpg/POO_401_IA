package unidad2.practica.paradigma.catalogo.productos;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.print("Producto: " + nombre + " | Precio: $" + precio);
    }
}

