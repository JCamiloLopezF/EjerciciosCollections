package co.edu.uniquindio.poo.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        System.out.println("Agregando estudiantes:");
        registro.agregarEstudiante(new Estudiante("E001", "María González"));
        registro.agregarEstudiante(new Estudiante("E002", "Carlos Pérez"));
        registro.agregarEstudiante(new Estudiante("E003", "Ana Martínez"));
        registro.agregarEstudiante(new Estudiante("E004", "Zoe Torres"));
        registro.agregarEstudiante(new Estudiante("E005", "Bernardo López"));


        registro.mostrarEstudiantes();


        System.out.println("\nPrimer estudiante (alfabéticamente): " + registro.obtenerPrimero());
        System.out.println("Último estudiante (alfabéticamente): " + registro.obtenerUltimo());


        System.out.println("\nTotal de estudiantes: " + registro.cantidadEstudiantes());
    }
}
