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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    // Constructor
    public Universidad(String nombre) {
         this.nombre = nombre;
         this.profesores = new ArrayList<>();
         this.cursos = new ArrayList<>();
}

    // Métodos
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Usa el método setProfesor
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores en la universidad:");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en la universidad:");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso); // Sincroniza la relación con el profesor
            }
            cursos.remove(curso); // Elimina el curso de la lista de la universidad
        }
    }

    public void eliminarProfesor(String id) {
    Profesor profesor = buscarProfesorPorId(id);
    if (profesor != null) {
        // Primero, desasignar al profesor de todos los cursos que dicta
        List<Curso> cursosProfesor = new ArrayList<>(profesor.getCursos());
        for (Curso curso : cursosProfesor) {
            curso.setProfesor(null);  // Romper la relación con el profesor
        }
        // Luego, eliminar el profesor de la lista de profesores
        profesores.remove(profesor);
    }
}

    public void mostrarReporte() {
        System.out.println("Reporte: Cantidad de cursos por profesor:");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + " tiene " + profesor.getCursos().size() + " cursos.");
        }
    }
}
