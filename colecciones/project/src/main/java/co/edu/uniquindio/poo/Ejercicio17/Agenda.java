package co.edu.uniquindio.poo.Ejercicio17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    private TreeMap<LocalDateTime, Evento> eventos;
    private static final DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Agenda() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDateTime fecha, Evento evento) {
        eventos.put(fecha, evento);
        System.out.println("Evento agregado para: " + fecha.format(formatter));
    }

    public void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos programados");
            return;
        }

        System.out.println("\nEventos programados:");
        System.out.println("----------------------------------------");
        eventos.forEach((fecha, evento) -> 
            System.out.println(fecha.format(formatter) + ": " + evento));
        System.out.println("----------------------------------------");
    }

    public Evento obtenerProximoEvento() {
        if (eventos.isEmpty()) {
            return null;
        }
        LocalDateTime ahora = LocalDateTime.now();
        Map.Entry<LocalDateTime, Evento> entrada = 
            eventos.ceilingEntry(ahora);
        return entrada != null ? entrada.getValue() : null;
    }

    public boolean eliminarEvento(LocalDateTime fecha) {
        Evento eliminado = eventos.remove(fecha);
        if (eliminado != null) {
            System.out.println("Evento eliminado para: " + fecha.format(formatter));
            return true;
        }
        System.out.println("No se encontró evento para: " + fecha.format(formatter));
        return false;
    }

    public int cantidadEventos() {
        return eventos.size();
    }
}
