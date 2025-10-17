/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Win
 */
public class Main {
    public static void main(String[] args) {
        // Crear profesores
        Profesor profesor1 = new Profesor("1", "Renzo Sosa", "Programación");
        Profesor profesor2 = new Profesor("2", "Leandro Rimoldi", "Estadística");
        Profesor profesor3 = new Profesor("3", "Guillermo Londero", "Base de Datos");
        Profesor profesor4 = new Profesor("4", "Carlos Pérez", "Inglés");

        // Crear universidad con el nombre adecuado
        Universidad universidad = new Universidad("La UTN");

        // Agregar profesores a la universidad
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        universidad.agregarProfesor(profesor4);

        // Crear cursos con los nombres y códigos adecuados
        Curso curso1 = new Curso("1", "Programación II");
        Curso curso2 = new Curso("2", "Probabilidad y Estadística");
        Curso curso3 = new Curso("3", "Base de Datos II");
        Curso curso4 = new Curso("4", "Inglés I");
        Curso curso5 = new Curso("5", "Organización Empresarial");

        // Agregar cursos a la universidad
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // Asignar profesores a cursos
        universidad.asignarProfesorACurso("1", "1"); // Programación II - Renzo Sosa
        universidad.asignarProfesorACurso("2", "2"); // Probabilidad y Estadística - Leandro Rimoldi
        universidad.asignarProfesorACurso("3", "3"); // Base de Datos II - Guillermo Londero
        universidad.asignarProfesorACurso("4", "4"); // Inglés I - Carlos Pérez
        universidad.asignarProfesorACurso("5", "3"); // Organización Empresarial - Guillermo Londero

        // Listar cursos con su profesor
        System.out.println("\nListar cursos con su profesor:");
        universidad.listarCursos();

        // Listar profesores con sus cursos
        System.out.println("\nListar profesores con sus cursos:");
        universidad.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\nCambiar el profesor del curso C003 (Base de Datos II):");
        universidad.asignarProfesorACurso("3", "2"); // Cambiar a Leandro Rimoldi
        universidad.listarCursos();

        // Eliminar un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\nEliminar curso C004 (Inglés I):");
        universidad.eliminarCurso("4");
        universidad.listarProfesores();

        // Eliminar un profesor y dejar su profesor = null
        System.out.println("\nEliminar profesor P003 (Guillermo Londero):");
        universidad.eliminarProfesor("3");
        universidad.listarProfesores();

        // Mostrar reporte de cantidad de cursos por profesor
        universidad.mostrarReporte();
    }
}
