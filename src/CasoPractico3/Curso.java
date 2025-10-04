/*
Caso Practico 3 - Universidad, Profesor y Curso
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico3;

public class Curso {
    private String codigo;
    private final String curso;
    private Profesor profesor;

    public Curso(String codigo, String curso) {
        this.codigo = codigo;
        this.curso = curso;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    // ========= Metodo para setear un profesor mediante sincronizacion
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        } // paso 1 - elimiinar el profesor si ya hay uno asginado
        this.profesor = p; // paso 2 - asiginar el profesor que llega por parametro (actualizar)
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this); // si el nuevo profesor no es null y todavía no tiene este curso en su lista, entonces lo agrego
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: "+ codigo + " ===== Curso: " + curso);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor);
        } else {
            System.out.println("Profesor sin asignar.");
        }     
    }
    
    @Override
    public String toString() {
        return "Curso[" + "Codigo: " + codigo + ", Curso: " + curso + ", Profesor: " + profesor + ']';
    }
    
    
}
