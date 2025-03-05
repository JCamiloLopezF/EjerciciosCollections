package co.edu.uniquindio.poo.Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean eliminarProducto(String codigo) {
        return productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public Producto buscarProducto(String codigo) {
        return productos.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst().orElse(null);
    }

    public void listarPorNombre() {
        ArrayList<Producto> ordenados = new ArrayList<>(productos);
        Collections.sort(ordenados);
        ordenados.forEach(System.out::println);
    }

    public void listarPorPrecio() {
        ArrayList<Producto> ordenados = new ArrayList<>(productos);
        ordenados.sort(Comparator.comparingDouble(Producto::getPrecio));
        ordenados.forEach(System.out::println);
    }
}
