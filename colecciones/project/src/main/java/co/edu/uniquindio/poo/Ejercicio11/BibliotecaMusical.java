package co.edu.uniquindio.poo.Ejercicio11;

import java.util.LinkedHashSet;
import java.util.Set;

public class BibliotecaMusical {
    private Set<Cancion> cancionesFavoritas;

    public BibliotecaMusical() {
        cancionesFavoritas = new LinkedHashSet<>();
    }

    public boolean agregarFavorita(Cancion cancion) {
        boolean agregada = cancionesFavoritas.add(cancion);
        if (agregada) {
            System.out.println("Canción agregada a favoritos: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos: " + cancion);
        }
        return agregada;
    }

    public boolean eliminarFavorita(String id) {
        boolean eliminada = cancionesFavoritas.removeIf(c -> c.toString().contains(id));
        if (eliminada) {
            System.out.println("Canción eliminada de favoritos con ID: " + id);
        } else {
            System.out.println("No se encontró la canción con ID: " + id);
        }
        return eliminada;
    }

    public void mostrarFavoritas() {
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("No hay canciones favoritas");
            return;
        }
        System.out.println("\nLista de canciones favoritas:");
        int i = 1;
        for (Cancion cancion : cancionesFavoritas) {
            System.out.println(i++ + ". " + cancion);
        }
    }
}
