package unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double nota1 = 00;
        double nota2 = 00;

        try {
            System.out.println("Ingresa la nota numero uno: ");
            nota1 = sc.nextInt();

            System.out.println("Ingresa la nota numero dos: ");
            nota2 = sc.nextInt();

            double notaPromedio = (nota1 + nota2) / 2;

            System.out.println("El promedio es de " + notaPromedio);

        }
        catch (InputMismatchException e){
            System.out.println("No has ingresado un numero " + e.getCause());

        }
        finally {
            System.out.println("Liberando recursos");
            sc.close();
        }

    }

}
