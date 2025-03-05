package co.edu.uniquindio.poo.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("001", "Laptop", 999.99));
        inventario.agregarProducto(new Producto("002", "Mouse", 29.99));
        inventario.agregarProducto(new Producto("003", "Teclado", 59.99));
        inventario.agregarProducto(new Producto("004", "Monitor", 299.99));
        inventario.agregarProducto(new Producto("005", "Auriculares", 79.99));
        inventario.agregarProducto(new Producto("006", "Tablet", 199.99));

        System.out.println("Productos ordenados por nombre:");
        inventario.listarPorNombre();

        System.out.println("\nProductos ordenados por precio:");
        inventario.listarPorPrecio();


        System.out.println("\nEjemplo: buscando producto con código 002:");
        Producto encontrado = inventario.buscarProducto("002");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        }


        System.out.println("\nEjemplo eliminando producto con código 003...");
        inventario.eliminarProducto("003");

        System.out.println("\nLista actualizada de productos:");
        inventario.listarPorNombre();
    }
}
