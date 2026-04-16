package unidad2.practica.dominio.gestion;

public class ReporteInventario {
    public static void main(String[] args) {
        int[] stock = {60, 25, 5, 0, 10, 45, 8, 70, 0, 15};

        for (int i = 0; i < stock.length; i++) {
            int cantidad = stock[i];
            String clasificacion;

            int categoria = (cantidad > 50) ? 1 : (cantidad >= 10) ? 2 : (cantidad >= 1) ? 3 : 0;

            switch (categoria) {
                case 1: clasificacion = "En stock"; break;
                case 2: clasificacion = "Bajo stock"; break;
                case 3: clasificacion = "Urgente"; break;
                default: clasificacion = "Descontinuado"; break;
            }
            System.out.println("Producto " + (i+1) + " | Cantidad: " + cantidad + " | Estado: " + clasificacion);
        }
    }
}