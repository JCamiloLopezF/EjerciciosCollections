package co.edu.uniquindio.poo.Ejercicio17;

public class Evento {
    private String nombre;
    private String descripcion;
    private String ubicacion;

    public Evento(String nombre, String descripcion, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + " (en " + ubicacion + ")";
    }
}
