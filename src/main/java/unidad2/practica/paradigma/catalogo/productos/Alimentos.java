package unidad2.practica.paradigma.catalogo.productos;

public class Alimentos extends Producto {
    private String fechaCaducidad;

    public Alimentos(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Caducidad: " + fechaCaducidad);
    }
}

