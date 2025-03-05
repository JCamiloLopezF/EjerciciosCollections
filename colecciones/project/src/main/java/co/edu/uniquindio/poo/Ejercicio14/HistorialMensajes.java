package co.edu.uniquindio.poo.Ejercicio14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class HistorialMensajes {
    private Deque<Mensaje> historial;
    private static final int MAX_MENSAJES = 10;

    public HistorialMensajes() {
        historial = new ArrayDeque<>(MAX_MENSAJES);
    }

    public void agregarMensaje(Mensaje mensaje) {
        if (historial.size() >= MAX_MENSAJES) {
            historial.removeFirst(); // Elimina el mensaje más antiguo
        }
        historial.addLast(mensaje);
        System.out.println("Mensaje agregado: " + mensaje);
    }

    public void mostrarUltimosMensajes() {
        if (historial.isEmpty()) {
            System.out.println("No hay mensajes en el historial");
            return;
        }

        System.out.println("\nÚltimos " + historial.size() + " mensajes:");
        Iterator<Mensaje> iterator = historial.descendingIterator();
        int contador = 1;
        while (iterator.hasNext()) {
            System.out.println(contador++ + ". " + iterator.next());
        }
    }

    public int cantidadMensajes() {
        return historial.size();
    }

    public void limpiarHistorial() {
        historial.clear();
        System.out.println("Historial limpiado");
    }
}