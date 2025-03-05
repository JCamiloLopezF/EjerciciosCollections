package co.edu.uniquindio.poo.Ejercicio12;

import java.util.TreeSet;

public class RegistroEstudiantes {
    private TreeSet<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new TreeSet<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.add(estudiante)) {
            System.out.println("Estudiante agregado: " + estudiante);
        } else {
            System.out.println("El estudiante ya existe en el registro");
        }
    }

    public Estudiante obtenerPrimero() {
        return estudiantes.isEmpty() ? null : estudiantes.first();
    }

    public Estudiante obtenerUltimo() {
        return estudiantes.isEmpty() ? null : estudiantes.last();
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
            return;
        }
        System.out.println("\nLista de estudiantes (ordenada alfabéticamente):");
        int i = 1;
        for (Estudiante estudiante : estudiantes) {
            System.out.println(i++ + ". " + estudiante);
        }
    }

    public int cantidadEstudiantes() {
        return estudiantes.size();
    }
}
