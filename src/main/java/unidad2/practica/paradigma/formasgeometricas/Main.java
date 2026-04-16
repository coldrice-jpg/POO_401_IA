package unidad2.practica.paradigma.formasgeometricas;

public class Main {
    public static void main(String[] args) {

        Forma[] misFormas = new Forma[3];

        misFormas[0] = new Circulo(5);
        misFormas[1] = new Rectangulo(10, 4);
        misFormas[2] = new Circulo(2.5);

        System.out.println("Calculando areas polimorficamente");

        for (Forma f : misFormas) {

            System.out.println("Area de la forma: " + f.calcularArea());
        }
    }
}