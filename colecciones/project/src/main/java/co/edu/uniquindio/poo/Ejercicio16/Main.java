package co.edu.uniquindio.poo.Ejercicio16;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        Producto p1 = new Producto("P001", "Manzanas", 2.50);
        Producto p2 = new Producto("P002", "Leche", 3.75);
        Producto p3 = new Producto("P003", "Pan", 1.99);
        Producto p4 = new Producto("P004", "Huevos", 4.50);

        // Agregar productos al carrito
        System.out.println("Agregando productos al carrito:");
        carrito.agregarProducto(p1, 3); // 3 manzanas
        carrito.agregarProducto(p2, 2); // 2 leches
        carrito.agregarProducto(p3, 1); // 1 pan
        carrito.agregarProducto(p4, 2); // 2 huevos

        carrito.mostrarCarrito();

        System.out.println("\nAgregando más unidades de un producto:");
        carrito.agregarProducto(p1, 2);

        System.out.println("\nEliminando un producto:");
        carrito.eliminarProducto(p3);

        carrito.mostrarCarrito();

        System.out.println("\nTotal de items en el carrito: " + carrito.cantidadProductos());
    }
}
