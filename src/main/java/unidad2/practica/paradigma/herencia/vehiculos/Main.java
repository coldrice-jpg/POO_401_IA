package unidad2.practica.paradigma.herencia.vehiculos;

public class Main {
    public static void main(String[] args) {

        Bicicleta miBici = new Bicicleta();
        Automovil miAuto = new Automovil();

        System.out.println("Probando Aceleración");

        System.out.print("Bicicleta: ");
        miBici.acelerar();

        System.out.print("Automóvil: ");
        miAuto.acelerar();

        System.out.println("\nSegunda ronda de aceleración");
        miBici.acelerar();
        miAuto.acelerar();
    }
}