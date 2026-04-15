package unidad3.excepciones;

public class EjemploArithmeticException {

    public static void main(String[] args) {

        try {

            int rest = 10 / 0;
            System.out.println(rest);

        }
        catch (Exception e) {

            System.out.println(e.getStackTrace());

        }
        finally {
            System.out.println("Siempre se ejecuta");
        }


    }

}
