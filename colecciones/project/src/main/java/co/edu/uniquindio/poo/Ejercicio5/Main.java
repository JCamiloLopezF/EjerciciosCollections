package co.edu.uniquindio.poo.Ejercicio5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // HashMap - No mantiene orden específico
        Map<Integer, Producto> hashMap = new HashMap<>();
        
        // LinkedHashMap - Mantiene orden de inserción
        Map<Integer, Producto> linkedHashMap = new LinkedHashMap<>();
        
        // TreeMap - Ordena por llave
        Map<Integer, Producto> treeMap = new TreeMap<>();

        // Agregar productos a cada mapa
        agregarProductos(hashMap);
        agregarProductos(linkedHashMap);
        agregarProductos(treeMap);

        // Mostrar contenido de cada mapa
        System.out.println("HashMap (orden aleatorio):");
        hashMap.forEach((k, v) -> System.out.println("ID " + k + ": " + v));

        System.out.println("\nLinkedHashMap (orden de inserción):");
        linkedHashMap.forEach((k, v) -> System.out.println("ID " + k + ": " + v));

        System.out.println("\nTreeMap (ordenado por ID):");
        treeMap.forEach((k, v) -> System.out.println("ID " + k + ": " + v));
    }

    private static void agregarProductos(Map<Integer, Producto> mapa) {
        mapa.put(5, new Producto("Laptop", 999.99));
        mapa.put(3, new Producto("Mouse", 29.99));
        mapa.put(1, new Producto("Teclado", 59.99));
        mapa.put(4, new Producto("Monitor", 299.99));
        mapa.put(2, new Producto("Auriculares", 79.99));
    }
}
