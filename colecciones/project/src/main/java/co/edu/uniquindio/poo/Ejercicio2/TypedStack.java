package co.edu.uniquindio.poo.Ejercicio2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class TypedStack<T> {
    private ArrayList<T> elements;
    private Class<?> topElementType;

    public TypedStack() {
        this.elements = new ArrayList<>();
        this.topElementType = null;
    }

    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("No se pueden insertar elementos nulos");
        }

        if (isEmpty()) {
            elements.add(element);
            topElementType = element.getClass();
        } else if (element.getClass() == topElementType) {
            elements.add(element);
        } else {
            throw new IllegalArgumentException(
                "El tipo del elemento (" + element.getClass().getSimpleName() + 
                ") no coincide con el tipo en la cima de la pila (" + 
                topElementType.getSimpleName() + ")"
            );
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        
        T element = elements.remove(elements.size() - 1);
        if (isEmpty()) {
            topElementType = null;
        }
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
