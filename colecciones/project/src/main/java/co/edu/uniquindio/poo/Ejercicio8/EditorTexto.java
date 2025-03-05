package co.edu.uniquindio.poo.Ejercicio8;

import java.util.Vector;

public class EditorTexto {
    private StringBuilder contenido;
    private Vector<TextChange> historial;

    public EditorTexto() {
        contenido = new StringBuilder();
        historial = new Vector<>();
    }

    public void insertarTexto(String texto, int posicion) {
        if (posicion < 0 || posicion > contenido.length()) {
            throw new IllegalArgumentException("Posición inválida");
        }
        contenido.insert(posicion, texto);
        historial.add(new TextChange(texto, posicion, true));
    }

    public void eliminarTexto(int inicio, int fin) {
        if (inicio < 0 || fin > contenido.length() || inicio >= fin) {
            throw new IllegalArgumentException("Rango inválido");
        }
        String textoEliminado = contenido.substring(inicio, fin);
        contenido.delete(inicio, fin);
        historial.add(new TextChange(textoEliminado, inicio, false));
    }

    public boolean deshacer() {
        if (historial.isEmpty()) {
            return false;
        }

        TextChange ultimoCambio = historial.remove(historial.size() - 1);
        if (ultimoCambio.esInsercion()) {
            // Deshacer inserción = eliminar texto
            contenido.delete(
                ultimoCambio.getPosicion(),ultimoCambio.getPosicion() + ultimoCambio.getContenido().length()
            );
        } else {
            // Deshacer eliminación = insertar texto
            contenido.insert(ultimoCambio.getPosicion(), ultimoCambio.getContenido());
        }
        return true;
    }

    public String getContenido() {
        return contenido.toString();
    }

    public void mostrarHistorial() {
        System.out.println("Historial de cambios:");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }
}
