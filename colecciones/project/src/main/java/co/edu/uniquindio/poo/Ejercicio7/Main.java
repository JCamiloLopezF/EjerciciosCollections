package co.edu.uniquindio.poo.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        SistemaAtencion sistema = new SistemaAtencion();

        // Generar turnos normales
        System.out.println("Generando turnos normales:");
        for (int i = 0; i < 3; i++) {
            String turno = sistema.generarTurno();
            System.out.println("Turno generado: " + turno);
        }

        System.out.println("\nEstado actual de la cola:");
        sistema.mostrarCola();

        // Agregar un turno urgente
        System.out.println("\nAgregando turno urgente:");
        sistema.agregarTurnoUrgente("URGENTE-001");
        sistema.mostrarCola();

        // Atender clientes
        System.out.println("\nAtendiendo clientes:");
        for (int i = 0; i < 3; i++) {
            String atendido = sistema.atenderSiguiente();
            System.out.println("Atendiendo: " + atendido);
            System.out.println("Clientes en espera: " + sistema.clientesEnEspera());
        }

        System.out.println("\nEstado final de la cola:");
        sistema.mostrarCola();
    }
}
