package co.edu.uniquindio.poo.Ejercicio14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {
    private String contenido;
    private String remitente;
    private LocalDateTime fecha;

    public Mensaje(String contenido, String remitente) {
        this.contenido = contenido;
        this.remitente = remitente;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "[" + fecha.format(formatter) + "] " + remitente + ": " + contenido;
    }
}
