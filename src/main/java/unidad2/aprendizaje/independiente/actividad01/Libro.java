package unidad2.aprendizaje.independiente.actividad01;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        Libro libro2 = new Libro("Fundación", "Isaac Asimov", 255);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}


