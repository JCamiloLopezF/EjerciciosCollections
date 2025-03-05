package co.edu.uniquindio.poo.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TypedStack<Object> pila = new TypedStack<>();

        try {
            pila.push("Hola");
            pila.push("Prueba");
            System.out.println("Elemento superior: " + pila.peek());
            
            pila.pop();
            pila.pop();
            
            pila.push(42);
            pila.push(10);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
