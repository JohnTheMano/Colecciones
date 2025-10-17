/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Win
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Profesor responsable del curso

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // No tiene profesor al inicio
    }

    // Métodos
    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // Elimina este curso del profesor previo
        }
        this.profesor = p;
        if (p != null) {
            p.agregarCurso(this); // Agrega este curso al nuevo profesor
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso [Código=" + codigo + ", Nombre=" + nombre + ", Profesor=" + (profesor != null ? profesor.getNombre() : "No asignado") + "]");
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
