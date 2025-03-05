package co.edu.uniquindio.poo.Ejercicio1;
//Ejercicio 1

//Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar un método que busque un producto por su código.

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Producto producto1 = new Producto("001", "Producto 1", 100.0);
        Producto producto2 = new Producto("002", "Producto 2", 200.0);

        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);

        System.out.println("Lista de productos:");
        System.out.println(empresa);

        System.out.println("Buscando producto con código '001':");
        Producto encontrado = empresa.buscarProductoPorCodigo("001");
        System.out.println(encontrado != null ? encontrado : "Producto no encontrado");
    }
}
