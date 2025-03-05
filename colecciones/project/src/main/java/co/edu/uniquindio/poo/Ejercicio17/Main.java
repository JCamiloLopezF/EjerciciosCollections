package co.edu.uniquindio.poo.Ejercicio17;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar algunos eventos
        System.out.println("Agregando eventos:");
        
        LocalDateTime fecha1 = LocalDateTime.now().plusDays(1);
        LocalDateTime fecha2 = LocalDateTime.now().plusDays(3);
        LocalDateTime fecha3 = LocalDateTime.now().plusDays(5);
        LocalDateTime fecha4 = LocalDateTime.now().plusWeeks(1);

        agenda.agregarEvento(fecha1, new Evento("Reunión de trabajo", "Presentación trimestral", "Sala 101"));
        agenda.agregarEvento(fecha2, new Evento("Almuerzo de negocios", "Cliente importante", "Restaurante XYZ"));
        agenda.agregarEvento(fecha3, new Evento("Conferencia", "Tecnologías emergentes", "Auditorio principal"));
        agenda.agregarEvento(fecha4, new Evento("Taller", "Desarrollo ágil", "Sala de capacitación"));

        agenda.mostrarEventos();

        System.out.println("\nPróximo evento:");
        Evento proximo = agenda.obtenerProximoEvento();
        if (proximo != null) {
            System.out.println(proximo);
        }

        System.out.println("\nEliminando evento:");
        agenda.eliminarEvento(fecha2);

        agenda.mostrarEventos();

        System.out.println("\nTotal de eventos: " + agenda.cantidadEventos());
    }
}
