/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Win
 */
public class Biblioteca {
     private String nombre;
    private List<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Agregar libro a la biblioteca
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);  // Asocia un libro con un autor
        libros.add(libro);
    }

    // Listar todos los libros
    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            return true;
        }
        return false;
    }

    // Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }

    // Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        List<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autores.contains(autor)) {
                autores.add(autor);
                autor.mostrarInfo();  // Muestra la información de cada autor solo una vez
            }
        }
    }
}
