/*
Caso Practico 2 - Biblioteca y Libros
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico2;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    
    // ============== Metodo para mostrar los datos del Autor en la consola
    public void mostrarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Autor[" + "ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad + ']';
    } 
}
