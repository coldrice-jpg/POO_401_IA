package unidad2.practica.paradigma;

public class Empleado {

    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = this.salario * (porcentaje / 100);
            this.salario += aumento;
            System.out.println("Aumento aplicado del " + porcentaje + "%.");
        } else {
            System.out.println("El porcentaje de aumento debe ser positivo.");
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado(101, 2500.0);

        System.out.println("Salario inicial: $" + emp.getSalario());

        emp.aumentarSalario(10);

        System.out.println("Salario después del aumento: $" + emp.getSalario());
    }
}
