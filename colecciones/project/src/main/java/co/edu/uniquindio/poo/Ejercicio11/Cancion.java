package co.edu.uniquindio.poo.Ejercicio11;

public class Cancion {
    private String id;
    private String titulo;
    private String artista;

    public Cancion(String id, String titulo, String artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return id.equals(cancion.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (ID: " + id + ")";
    }
}
