package co.edu.uniquindio.poo.Ejercicio13;

public class Paciente implements Comparable<Paciente> {
    private String id;
    private String nombre;
    private int nivelPrioridad;  // 1 = más urgente, 5 = menos urgente

    public Paciente(String id, String nombre, int nivelPrioridad) {
        this.id = id;
        this.nombre = nombre;
        if (nivelPrioridad < 1 || nivelPrioridad > 5) {
            throw new IllegalArgumentException("Nivel de prioridad debe estar entre 1 y 5");
        }
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.nivelPrioridad, otro.nivelPrioridad);
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ", Prioridad: " + nivelPrioridad + ")";
    }
}
