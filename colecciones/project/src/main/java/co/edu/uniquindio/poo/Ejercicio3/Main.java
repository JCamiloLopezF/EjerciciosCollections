package co.edu.uniquindio.poo.Ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un conjunto
        Set<String> conjuntoUnico = new HashSet<>();

        // Agregar elementos al conjunto
        conjuntoUnico.add("Manzana");
        conjuntoUnico.add("Banana");
        conjuntoUnico.add("Naranja");
        conjuntoUnico.add("Manzana"); // Duplicado
        conjuntoUnico.add("Pera");

        // Crear un iterador
        Iterator<String> iterador = conjuntoUnico.iterator();

        // Mostrar los elementos del conjunto
        System.out.println("Elementos en el conjunto:");
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento);
        }

        System.out.println("\nTamaño del conjunto: " + conjuntoUnico.size());
    }
}
