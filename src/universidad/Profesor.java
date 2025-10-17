/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Win
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
     private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("Profesor [ID=" + id + ", Nombre=" + nombre + ", Especialidad=" + especialidad + "]");
        System.out.println("Cursos: " + cursos.size());
    }

    // Agregar curso al profesor
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // Eliminar curso del profesor
    public void eliminarCurso(Curso c) {
        cursos.remove(c);
    }
}
