/*
Caso Practico 3 - Universidad, Profesor y Curso
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private final String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

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

    @Override
    public String toString() {
        return "Profesor[" + "ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos: " + cursos.size() + ']';
    }
    
    // ============ Metodo para agregar un curso (sincronizado)
    public void agregarCurso(Curso c) {
      if (c == null) return;
      if (!cursos.contains(c)) {
          cursos.add(c);
          if (c.getProfesor() != this) {
              c.setProfesor(this); // sincroniza el otro lado
          }
      }
    }
    
    // ============ Metodo para eliminar un curso (sincronizado)
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // rompe la relación del otro lado
            }
        }
    }
    
    // ============ Metodo para listar los cursos
    public void listarCursos() {
        System.out.println("Cursos del profesor: " + nombre + " (id: " + id + "):");
        if (cursos.isEmpty()) {
            System.out.println("No tiene cursos asignados.");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("  - " + c.getCodigo() + " | " + c.getCurso());
        }
    }
    
    // ============ Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("==== DATOS ====");
        System.out.println("Profesor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
    
}