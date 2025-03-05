package co.edu.uniquindio.poo.Ejercicio4;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;  // 1 es la más alta, 5 es la más baja

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + " (Prioridad: " + prioridad + ")";
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        // Ordenar por prioridad (números más bajos = mayor prioridad)
        return Integer.compare(this.prioridad, otraTarea.prioridad);
    }
}
