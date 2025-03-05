package co.edu.uniquindio.poo.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        BibliotecaMusical biblioteca = new BibliotecaMusical();

        // Agregar canciones a favoritos
        System.out.println("Agregando canciones a favoritos:");
        biblioteca.agregarFavorita(new Cancion("C001", "Bohemian Rhapsody", "Queen"));
        biblioteca.agregarFavorita(new Cancion("C002", "Imagine", "John Lennon"));
        biblioteca.agregarFavorita(new Cancion("C003", "Hotel California", "Eagles"));

        // Mostrar lista de favoritos
        biblioteca.mostrarFavoritas();

        // Intentar agregar una canción duplicada
        System.out.println("\nIntentando agregar canción duplicada:");
        biblioteca.agregarFavorita(new Cancion("C001", "Bohemian Rhapsody", "Queen"));

        // Eliminar una canción
        System.out.println("\nEliminando una canción:");
        biblioteca.eliminarFavorita("C002");

        // Mostrar lista actualizada
        biblioteca.mostrarFavoritas();
    }
}
