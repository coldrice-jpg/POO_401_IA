package unidad2.practica.paradigma.catalogo.productos;

public class Electronica extends Producto {
    private int mesesGarantia;

    public Electronica(String nombre, double precio, int mesesGarantia) {
        super(nombre, precio);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Garantía: " + mesesGarantia + " meses.");
    }
}


