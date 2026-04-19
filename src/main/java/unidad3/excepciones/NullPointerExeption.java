package unidad3.excepciones;

public class NullPointerExeption {

    int numero;



    public static void main(String[] args) {

        try {
            NullPointerExeption cs = new NullPointerExeption();
            System.out.println(cs.getNumero());
        }
        catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }


    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
