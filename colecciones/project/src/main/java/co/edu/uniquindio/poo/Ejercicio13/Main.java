package co.edu.uniquindio.poo.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        SalaEmergencia sala = new SalaEmergencia();

        System.out.println("Registrando pacientes:");
        sala.registrarPaciente(new Paciente("P001", "Juan Pérez", 3));
        sala.registrarPaciente(new Paciente("P002", "María García", 1));  // Emergencia
        sala.registrarPaciente(new Paciente("P003", "Carlos López", 4));
        sala.registrarPaciente(new Paciente("P004", "Ana Martínez", 2));
        sala.registrarPaciente(new Paciente("P005", "Luis Torres", 1));   // Emergencia


        sala.mostrarListaEspera();


        System.out.println("\nAtendiendo pacientes:");
        for (int i = 0; i < 3; i++) {
            sala.atenderSiguientePaciente();
        }


        System.out.println("\nLista de espera actualizada:");
        sala.mostrarListaEspera();


        System.out.println("\nPacientes restantes en espera: " + 
                          sala.cantidadPacientesEspera());
    }
}
