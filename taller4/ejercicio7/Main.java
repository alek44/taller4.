
package taller4.ejercicio7;


public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("", "", "", "", "", 0, "", "", "");
        System.out.println("---LLENANDO LIBROS---");
        libro1.llenarLibros();
        System.out.println("");
        System.out.println("---MOSTRANDO LIBROS---");
        libro1.mostrarLibros();
    }
}
