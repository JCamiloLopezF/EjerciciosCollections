package co.edu.uniquindio.poo.Ejercicio15;

public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        System.out.println("Agregando contactos:");
        directorio.agregarContacto("Juan Pérez", "555-0101");
        directorio.agregarContacto("María García", "555-0202");
        directorio.agregarContacto("Carlos López", "555-0303");
        directorio.agregarContacto("Ana Martínez", "555-0404");

        directorio.mostrarDirectorio();

        System.out.println("\nBuscando contactos:");
        System.out.println("Teléfono de María García: " + directorio.buscarTelefono("María García"));
        System.out.println("Teléfono de Pedro Ruiz: " + directorio.buscarTelefono("Pedro Ruiz"));

        System.out.println("\nActualizando contacto:");
        directorio.agregarContacto("Juan Pérez", "555-0505");

        System.out.println("\nEliminando contacto:");
        directorio.eliminarContacto("Carlos López");

        directorio.mostrarDirectorio();

        System.out.println("\nTotal de contactos: " + directorio.cantidadContactos());
    }
}
