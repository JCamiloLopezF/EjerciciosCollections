package co.edu.uniquindio.poo.Ejercicio12;

public class Estudiante implements Comparable<Estudiante> {
    private String id;
    private String nombre;

    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Estudiante otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }
}
