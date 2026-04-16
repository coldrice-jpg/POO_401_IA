package unidad2.practica.paradigma.constructores;

public class Main {
    public static void main(String[] args) {

        Circulo miCirculo = new Circulo(5.0);

        double area = miCirculo.calcularArea();
        double circunferencia = miCirculo.calcularCircunferencia();

        System.out.println("Área calculada: " + area);
        System.out.println("Circunferencia calculada: " + circunferencia);
    }
}