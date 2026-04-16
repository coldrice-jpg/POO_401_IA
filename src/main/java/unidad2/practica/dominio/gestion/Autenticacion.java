package unidad2.practica.dominio.gestion;

import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean accesoConcedido = false;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Intento " + i + "/3");
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            if (user.equals("admin")) {
                if (pass.equals("pass123")) {
                    System.out.println("Autenticación exitosa. Bienvenido.");
                    accesoConcedido = true;
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        if (!accesoConcedido) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
    }
}