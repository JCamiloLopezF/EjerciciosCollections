package co.edu.uniquindio.poo.Ejercicio10;

import java.util.HashSet;
import java.util.Set;

public class ControlAcceso {
    private Set<Empleado> empleadosAutorizados;
    private Set<String> registroAccesos;

    public ControlAcceso() {
        empleadosAutorizados = new HashSet<>();
        registroAccesos = new HashSet<>();
    }

    public boolean registrarEmpleado(Empleado empleado) {
        return empleadosAutorizados.add(empleado);
    }

    public boolean verificarAcceso(String id) {
        return empleadosAutorizados.stream()
                .anyMatch(e -> e.getId().equals(id));
    }

    public boolean registrarAcceso(String id) {
        if (verificarAcceso(id)) {
            registroAccesos.add(id);
            System.out.println("Acceso permitido para ID: " + id);
            return true;
        }
        System.out.println("Acceso denegado para ID: " + id);
        return false;
    }

    public void mostrarEmpleadosAutorizados() {
        System.out.println("\nEmpleados autorizados:");
        empleadosAutorizados.forEach(System.out::println);
    }

    public void mostrarRegistroAccesos() {
        System.out.println("\nRegistro de accesos del día:");
        registroAccesos.forEach(id -> System.out.println("Acceso: ID " + id));
    }
}
