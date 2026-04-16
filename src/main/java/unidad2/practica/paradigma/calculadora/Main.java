package unidad2.practica.paradigma.calculadora;

public class Main {

    public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    int suma2 = calc.sumar(10, 20);
    System.out.println("Suma de dos enteros (10 + 20): " + suma2);

    int suma3 = calc.sumar(10, 20, 30);
    System.out.println("Suma de tres enteros (10 + 20 + 30): " + suma3);

    double sumaDecimal = calc.sumar(10.5, 20.3);
    System.out.println("Suma de dos decimales (10.5 + 20.3): " + sumaDecimal);
}
}
