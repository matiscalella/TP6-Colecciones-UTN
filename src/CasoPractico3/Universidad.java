/*
Caso Practico 3 - Universidad, Profesor y Curso
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    // =========== Metodo para agregar un profesor
    public boolean agregarProfesor(Profesor p) {
        if (p == null) return false;
        if (buscarProfesorPorId(p.getId()) != null) return false;
        return profesores.add(p);
    }

    // =========== Metodo para agregar un curso
    public boolean agregarCurso(Curso c) {
        if (c == null) return false;
        if (buscarCursoPorCodigo(c.getCodigo()) != null) return false;
        return cursos.add(c);
    }

    // ================= Búsquedas =================
    public Profesor buscarProfesorPorId(String id) {
        if (id == null) return null;
        for (Profesor p : profesores) {
            if (id.equals(p.getId())) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (Curso c : cursos) {
            if (codigo.equals(c.getCodigo())) return c;
        }
        return null;
    }

    // ================= Asignación =================
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p); // sincroniza la lista del profesor
        return true;
    }

    // ================= Listados =================
    public void listarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        if (profesores.isEmpty()) {
            System.out.println("  (sin profesores)");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("-----------------------------");
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  (sin cursos)");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println("-----------------------------");
        }
    }

    // ================= Bajas =================
    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        if (c.getProfesor() != null) {
            // Romper la relación del lado Curso (sincroniza del otro lado)
            c.setProfesor(null);
        }
        return cursos.remove(c);
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return false;
        List<Curso> copia = new ArrayList<>(p.getCursos());
        for (Curso c : copia) {
            c.setProfesor(null); // sincroniza quitando el curso de la lista del profesor
        }
        return profesores.remove(p);
    }

    public void imprimirReporteCantidadCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor");
        if (profesores.isEmpty()) {
            System.out.println("  (sin profesores)");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println(" - " + p.getNombre() + " [" + p.getId() + "]: " + p.getCursos().size());
        }
    }
    
    @Override
    public String toString() {
        return "Universidad[" + "Nombre: " + nombre + ", Profesores: " + profesores + ", Cursos: " + cursos.size() + ']';
    }  
}
