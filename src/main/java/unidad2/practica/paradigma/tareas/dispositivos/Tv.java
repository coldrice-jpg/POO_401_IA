package unidad2.practica.paradigma.tareas.dispositivos;

public class Tv implements Encendible {
    @Override
    public void encender() {
        System.out.println("La TV muestra el logo de bienvenida y se ilumina la pantalla.");
    }

    @Override
    public void apagar() {
        System.out.println("La TV guarda la configuración y apaga la pantalla.");
    }
}


