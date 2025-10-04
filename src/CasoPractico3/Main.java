/*
Caso Practico 3 - Universidad, Profesor y Curso
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico3;

public class Main {
    public static void main(String[] args) {
        
        // Tarea 1 
        Universidad utn = new Universidad("Universidad Tecnologica Nacional");
        
        Profesor p1 = new Profesor("001", "Matias", "Programacion");
        Profesor p2 = new Profesor("002", "Nicolas", "Matematica");
        Profesor p3 = new Profesor("003", "Magali", "Diseño Grafico");
        
        Curso c1 = new Curso("BD1", "Bases de datos");
        Curso c2 = new Curso("PO0", "Algoritmos");
        Curso c3 = new Curso("MM2", "Algebra de Boole");
        Curso c4 = new Curso("DG2", "Branding");
        Curso c5 = new Curso("DG3", "Colorimetria");
        
        System.out.println("----------- Tarea 1 -----------");
        System.out.println("3 Profesores creados exitosamente.");
        System.out.println("5 cursos creados correctamente.\n");
        
        // Tarea 2
        System.out.println("----------- Tarea 2 -----------");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        System.out.println("Profesores y cursos agregados a la universidad exitosamente.\n");

        // Tarea 3
        System.out.println("----------- Tarea 3 -----------");
        utn.asignarProfesorACurso("BD1", "001");
        utn.asignarProfesorACurso("PO0", "001");
        utn.asignarProfesorACurso("MM2", "002");
        utn.asignarProfesorACurso("DG2", "003");
        utn.asignarProfesorACurso("DG3", "003");
        System.out.println("Cursos asignados a cada profesor.");
        System.out.println("");
        
        // Tarea 4
        System.out.println("----------- Tarea 4 -----------");
        utn.listarCursos();
        utn.listarProfesores();
        
        // Tarea 5
        System.out.println("----------- Tarea 5 -----------");
        System.out.println("Se realiza el cambio del curso PO0 para asignarlo al profesor 003");
        utn.asignarProfesorACurso("PO0", "003");
        System.out.println("Resultado: ");
        utn.listarCursos();
        System.out.println("");

        
        // Tarea 6
        System.out.println("----------- Tarea 6 -----------");
        utn.eliminarCurso("DG2");
        System.out.println("Se elimina el curso DG2");
        System.out.println("Resultado: ");
        utn.listarCursos();
        System.out.println("");
        
        // Tarea 7
        System.out.println("----------- Tarea 7 -----------");
        utn.eliminarProfesor("002");
        System.out.println("Se elimina el profesor 002");
        System.out.println("Resultado: ");
        utn.listarProfesores();
        System.out.println("");
        
        // Tarea 8
        System.out.println("----------- Tarea 8 -----------");
        utn.imprimirReporteCantidadCursosPorProfesor();
        
    }
}
