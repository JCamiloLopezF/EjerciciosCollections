package co.edu.uniquindio.poo.Ejercicio4;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Crear una cola de prioridad
        Queue<Tarea> colaTareas = new PriorityQueue<>();

        // Agregar tareas con diferentes prioridades
        colaTareas.offer(new Tarea("Hacer informe", 2));
        colaTareas.offer(new Tarea("Reunión urgente", 1));
        colaTareas.offer(new Tarea("Revisar correo", 3));
        colaTareas.offer(new Tarea("Llamar al cliente", 1));
        colaTareas.offer(new Tarea("Organizar archivo", 4));

        // Procesar tareas (las tareas saldrán en orden de prioridad)
        System.out.println("Procesando tareas por orden de prioridad:");
        while (!colaTareas.isEmpty()) {
            Tarea tarea = colaTareas.poll();
            System.out.println(tarea);
        }
    }
}
