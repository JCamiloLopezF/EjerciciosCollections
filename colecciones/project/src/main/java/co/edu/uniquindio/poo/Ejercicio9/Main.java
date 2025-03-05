package co.edu.uniquindio.poo.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();

        // Simular navegación
        System.out.println("Navegación web:");
        navegador.visitarPagina("www.google.com", "Google");
        navegador.visitarPagina("www.wikipedia.org", "Wikipedia");
        navegador.visitarPagina("www.github.com", "GitHub");

        // Mostrar historial actual
        navegador.mostrarHistorial();

        // Retroceder
        System.out.println("\nRetrocediendo en el historial:");
        navegador.retroceder();
        
        // Mostrar historial después de retroceder
        navegador.mostrarHistorial();

        // Avanzar
        System.out.println("\nAvanzando en el historial:");
        navegador.avanzar();

        // Mostrar historial final
        navegador.mostrarHistorial();
    }
}
