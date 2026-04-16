package unidad2.practica.dominio.gestion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RegistroProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Cantidad en stock: ");
            int cantidad = sc.nextInt();

            System.out.print("Precio unitario: ");
            double precio = sc.nextDouble();

            if (cantidad > 0) {
                if (precio > 0) {
                    System.out.println("Confirmación: Producto " + nombre + " registrado exitosamente.");
                } else {
                    System.out.println("Error: El precio debe ser un número positivo.");
                }
            } else {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error Crítico: Entrada no válida. Asegúrese de usar números para cantidad y precio.");
        }
    }
}
