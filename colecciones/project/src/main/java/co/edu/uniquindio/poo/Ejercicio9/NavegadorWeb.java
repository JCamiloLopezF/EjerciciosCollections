package co.edu.uniquindio.poo.Ejercicio9;

import java.util.Stack;

public class NavegadorWeb {
    private Stack<Pagina> historial;
    private Stack<Pagina> adelante;

    public NavegadorWeb() {
        historial = new Stack<>();
        adelante = new Stack<>();
    }

    public void visitarPagina(String url, String titulo) {
        Pagina nuevaPagina = new Pagina(url, titulo);
        historial.push(nuevaPagina);
        adelante.clear(); // Al visitar una nueva página, se limpia el historial "adelante"
        System.out.println("Visitando: " + nuevaPagina);
    }

    public boolean retroceder() {
        if (historial.size() <= 1) {
            System.out.println("No hay páginas anteriores");
            return false;
        }

        Pagina paginaActual = historial.pop();
        adelante.push(paginaActual);
        System.out.println("Retrocediendo a: " + historial.peek());
        return true;
    }

    public boolean avanzar() {
        if (adelante.isEmpty()) {
            System.out.println("No hay páginas para avanzar");
            return false;
        }

        Pagina siguiente = adelante.pop();
        historial.push(siguiente);
        System.out.println("Avanzando a: " + siguiente);
        return true;
    }

    public void mostrarHistorial() {
        System.out.println("\nHistorial de navegación:");
        for (int i = historial.size() - 1; i >= 0; i--) {
            System.out.println((historial.size() - i) + ". " + historial.get(i));
        }
    }
}
