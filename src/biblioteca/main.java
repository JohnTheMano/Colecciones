/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Win
 */
public class main {
    public static void main(String[] args) {
        
        // Crear autores
        Autor autor1 = new Autor("A001", "Ricardo Piglia", "Argentino");
        Autor autor2 = new Autor("A002", "Mafalda (Quino)", "Argentino");
        Autor autor3 = new Autor("A003", "Hernán Casciari", "Argentino");
        Autor autor4 = new Autor("A004", "Roberto Fontanarrosa", "Argentino");
        
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca del Humor Argentino");
        
        // Agregar libros con títulos cómicos y autores
        biblioteca.agregarLibro("12345", "Cómo Ser un Literato sin Esforzarse", 2010, autor1);
        biblioteca.agregarLibro("67890", "Mafalda, la Revolución del Alfajor", 2015, autor2);
        biblioteca.agregarLibro("11223", "El pibe que arruinaba los finales de las películas", 2009, autor3);
        biblioteca.agregarLibro("44556", "El partido de los 100 años", 1993, autor4);
        biblioteca.agregarLibro("99887", "Historias de un Hombre Solo", 2017, autor1);
        
        // Listar todos los libros con su información
        System.out.println("Listado de libros:");
        biblioteca.listarLibros();
        
        // Buscar libro por ISBN
        System.out.println("\nBuscar libro con ISBN 12345:");
        Libro libro = biblioteca.buscarLibroPorIsbn("12345");
        if (libro != null) {
            libro.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        
        // Filtrar libros por año
        System.out.println("\nFiltrar libros de 2009:");
        biblioteca.filtrarLibrosPorAnio(2009);
        
        // Eliminar libro
        System.out.println("\nEliminar libro con ISBN 67890:");
        if (biblioteca.eliminarLibro("67890")) {
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No se encontró el libro.");
        }
        
        // Mostrar la cantidad total de libros
        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // Listar todos los autores disponibles
        System.out.println("\nAutores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
