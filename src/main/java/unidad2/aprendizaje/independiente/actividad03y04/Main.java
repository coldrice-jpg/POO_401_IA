package unidad2.aprendizaje.independiente.actividad03y04;

public class Main {

    public static void main(String[] args) {

        Animal[] zoologico = new Animal[2];
        zoologico[0] = new Perro();
        zoologico[1] = new Gato();

        for (Animal animal : zoologico) {
            animal.hacerSonido();
        }
    }

}
