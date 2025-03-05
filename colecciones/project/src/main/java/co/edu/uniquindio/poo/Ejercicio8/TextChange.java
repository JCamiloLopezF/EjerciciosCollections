package co.edu.uniquindio.poo.Ejercicio8;

public class TextChange {
    private String contenido;
    private int posicion;
    private boolean esInsercion;

    public TextChange(String contenido, int posicion, boolean esInsercion) {
        this.contenido = contenido;
        this.posicion = posicion;
        this.esInsercion = esInsercion;
    }

    public String getContenido() { return contenido; }
    public int getPosicion() { return posicion; }
    public boolean esInsercion() { return esInsercion; }

    @Override
    public String toString() {
        return (esInsercion ? "Inserción: " : "Eliminación: ") + 
               "'" + contenido + "' en posición " + posicion;
    }
}