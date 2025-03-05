package co.edu.uniquindio.poo.Ejercicio14;

public class Main {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        System.out.println("Enviando mensajes:");
        historial.agregarMensaje(new Mensaje("¡Hola!", "Juan"));
        historial.agregarMensaje(new Mensaje("¿Cómo estás?", "María"));
        historial.agregarMensaje(new Mensaje("Bien, gracias", "Juan"));
        historial.agregarMensaje(new Mensaje("¿Nos vemos mañana?", "María"));
        historial.agregarMensaje(new Mensaje("Claro", "Juan"));


        historial.mostrarUltimosMensajes();


        System.out.println("\nAgregando más mensajes:");
        for (int i = 1; i <= 6; i++) {
            historial.agregarMensaje(new Mensaje("Mensaje " + i, "Sistema"));
        }


        historial.mostrarUltimosMensajes();


        System.out.println("\nTotal de mensajes en historial: " +  historial.cantidadMensajes());
    }
}
