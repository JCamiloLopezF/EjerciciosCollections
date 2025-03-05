package co.edu.uniquindio.poo.Ejercicio16;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarritoCompras {
    private Map<Producto, Integer> productos;

    public CarritoCompras() {
        productos = new LinkedHashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.merge(producto, cantidad, Integer::sum);
        System.out.println("Agregado: " + cantidad + "x " + producto);
    }

    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío");
            return;
        }

        System.out.println("\nContenido del carrito:");
        System.out.println("----------------------------------------");
        int i = 1;
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double subtotal = producto.getPrecio() * cantidad;
            System.out.printf("%d. %s x%d = $%.2f%n", 
                i++, producto, cantidad, subtotal);
        }
        System.out.println("----------------------------------------");
        System.out.printf("Total: $%.2f%n", calcularTotal());
    }

    public double calcularTotal() {
        return productos.entrySet().stream()
            .mapToDouble(entry -> entry.getKey().getPrecio() * entry.getValue())
            .sum();
    }

    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto) != null) {
            System.out.println("Producto eliminado: " + producto);
        } else {
            System.out.println("Producto no encontrado en el carrito");
        }
    }

    public int cantidadProductos() {
        return productos.values().stream().mapToInt(Integer::intValue).sum();
    }
}
