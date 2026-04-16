package unidad2.practica.dominio.gestion;

import java.util.Scanner;

public class Notificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        do {
            System.out.print("Ingrese su correo para recibir notificaciones: ");
            email = sc.nextLine();
        } while (!validarEmail(email));

        System.out.println("Correo validado. Notificaciones activadas para: " + email);
    }

    public static boolean validarEmail(String email) {

        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        System.out.println("Email inválido. Intente de nuevo.");
        return false;
    }
}
