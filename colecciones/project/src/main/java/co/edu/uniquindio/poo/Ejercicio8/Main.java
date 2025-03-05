package co.edu.uniquindio.poo.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        // Realizar algunos cambios
        System.out.println("Realizando cambios en el editor:");
        editor.insertarTexto("Hola ", 0);
        System.out.println("Texto actual: " + editor.getContenido());

        editor.insertarTexto("mundo!", 5);
        System.out.println("Texto actual: " + editor.getContenido());

        editor.insertarTexto(" Bienvenidos ", 11);
        System.out.println("Texto actual: " + editor.getContenido());

        // Mostrar historial
        System.out.println("\nHistorial de cambios:");
        editor.mostrarHistorial();

        // Deshacer cambios
        System.out.println("\nDeshaciendo cambios:");
        editor.deshacer();
        System.out.println("Después de deshacer: " + editor.getContenido());

        editor.deshacer();
        System.out.println("Después de deshacer: " + editor.getContenido());

        // Mostrar historial actualizado
        System.out.println("\nHistorial actualizado:");
        editor.mostrarHistorial();
    }
}
