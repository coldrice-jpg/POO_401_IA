package unidad2.ejercicio.emilio;

public class Rectangulo extends FiguraGeometrica {

    double base, altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;

    }

    @Override
    double calcularArea() {
        double area = base * altura;

        return area;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }

}
