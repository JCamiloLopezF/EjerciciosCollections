package co.edu.uniquindio.poo.Ejercicio7;

import java.util.LinkedList;

public class SistemaAtencion {
    private LinkedList<String> cola;
    private int numeroTurno;

    public SistemaAtencion() {
        cola = new LinkedList<>();
        numeroTurno = 1;
    }

    public String generarTurno() {
        String turno = "T" + String.format("%03d", numeroTurno++);
        cola.addLast(turno);
        return turno;
    }

    public void agregarTurnoUrgente(String turno) {
        cola.addFirst(turno);
    }

    public String atenderSiguiente() {
        if (cola.isEmpty()) {
            return "No hay clientes en espera";
        }
        return cola.removeFirst();
    }

    public int clientesEnEspera() {
        return cola.size();
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes en espera");
            return;
        }
        System.out.println("Cola actual: " + String.join(" -> ", cola));
    }
}
