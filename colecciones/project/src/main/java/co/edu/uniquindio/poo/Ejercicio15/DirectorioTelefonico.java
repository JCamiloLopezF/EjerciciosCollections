package co.edu.uniquindio.poo.Ejercicio15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    private Map<String, String> contactos;

    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            System.out.println("Actualizando contacto existente: " + nombre);
        }
        contactos.put(nombre, telefono);
        System.out.println("Contacto agregado: " + nombre + " - " + telefono);
    }

    public String buscarTelefono(String nombre) {
        String telefono = contactos.get(nombre);
        if (telefono != null) {
            return telefono;
        }
        return "Contacto no encontrado";
    }

    public boolean eliminarContacto(String nombre) {
        if (contactos.remove(nombre) != null) {
            System.out.println("Contacto eliminado: " + nombre);
            return true;
        }
        System.out.println("Contacto no encontrado: " + nombre);
        return false;
    }

    public void mostrarDirectorio() {
        if (contactos.isEmpty()) {
            System.out.println("El directorio está vacío");
            return;
        }
        System.out.println("\nDirectorio telefónico:");
        contactos.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public int cantidadContactos() {
        return contactos.size();
    }
}
