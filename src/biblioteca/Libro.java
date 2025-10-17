/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Win
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;  // Este es el atributo que lo asocia a un Autor

    // Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    // Mostrar info
    public void mostrarInfo() {
        System.out.println("Libro [ISBN=" + isbn + ", Titulo=" + titulo + ", Año de Publicación=" + anioPublicacion + "]");
        autor.mostrarInfo();  // Muestra también la info del autor
    }
}
