package co.edu.uniquindio.poo.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();

        // Registrar empleados autorizados
        System.out.println("Registrando empleados:");
        control.registrarEmpleado(new Empleado("E001", "Juan Pérez"));
        control.registrarEmpleado(new Empleado("E002", "María García"));
        control.registrarEmpleado(new Empleado("E003", "Carlos López"));
        
        // Intentar registrar un empleado duplicado
        boolean registroDuplicado = control.registrarEmpleado(new Empleado("E001", "Juan Pérez"));
        System.out.println("Intento de registro duplicado: " + (registroDuplicado ? "exitoso" : "fallido"));

        // Mostrar empleados autorizados
        control.mostrarEmpleadosAutorizados();

        // Simular algunos accesos
        System.out.println("\nSimulando accesos:");
        control.registrarAcceso("E001"); // Autorizado
        control.registrarAcceso("E002"); // Autorizado
        control.registrarAcceso("E004"); // No autorizado
        control.registrarAcceso("E001"); // Autorizado (acceso repetido)

        // Mostrar registro de accesos
        control.mostrarRegistroAccesos();
    }
}
