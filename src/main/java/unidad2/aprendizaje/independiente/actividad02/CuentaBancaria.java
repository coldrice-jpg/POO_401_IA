package unidad2.aprendizaje.independiente.actividad02;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + ". Nuevo saldo: $" + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes para retirar $" + cantidad);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println("Saldo final consultado: $" + cuenta.getSaldo());
    }
}