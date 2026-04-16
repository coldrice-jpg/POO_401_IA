package unidad2.practica.paradigma.catalogo.productos;

public class Main {
    public static void main(String[] args) {

        Producto[] inventario = new Producto[3];

        inventario[0] = new Electronica("Smartphone", 8500.0, 12);
        inventario[1] = new Alimentos("Leche Entera", 25.50, "2026-05-20");
        inventario[2] = new Electronica("Audífonos BT", 1200.0, 6);


        for (Producto p : inventario) {
            p.mostrarDetalles();
        }
    }
}
