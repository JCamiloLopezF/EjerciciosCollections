package co.edu.uniquindio.poo.Ejercicio13;

import java.util.PriorityQueue;

public class SalaEmergencia {
    private PriorityQueue<Paciente> colaPacientes;

    public SalaEmergencia() {
        colaPacientes = new PriorityQueue<>();
    }

    public void registrarPaciente(Paciente paciente) {
        colaPacientes.offer(paciente);
        System.out.println("Paciente registrado: " + paciente);
    }

    public Paciente atenderSiguientePaciente() {
        Paciente paciente = colaPacientes.poll();
        if (paciente != null) {
            System.out.println("Atendiendo paciente: " + paciente);
        } else {
            System.out.println("No hay pacientes en espera");
        }
        return paciente;
    }

    public void mostrarListaEspera() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en espera");
            return;
        }
        System.out.println("\nPacientes en espera (ordenados por prioridad):");
        PriorityQueue<Paciente> copiaCola = new PriorityQueue<>(colaPacientes);
        int i = 1;
        while (!copiaCola.isEmpty()) {
            System.out.println(i++ + ". " + copiaCola.poll());
        }
    }

    public int cantidadPacientesEspera() {
        return colaPacientes.size();
    }
}
