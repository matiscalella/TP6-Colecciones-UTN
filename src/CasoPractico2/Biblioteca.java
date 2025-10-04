/*
Caso Practico 2 - Biblioteca y Libros
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // ============= Metodo para agregar un libro a la coleccion con validacion el ISBN
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("El ISBN (" + isbn + ") ya existe en la biblioteca.");
                return;
            }
        } 
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
        System.out.println("El libro ('" + titulo + "') fue agregado exitosamente a la biblioteca.");
    }
    
    // ============= Metodo para mostrar los libros de la biblioteca
    public void listarLibros(){
        System.out.println("==== LIBROS DE LA BIBLIOTECA ====");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    // ============= Metodo para buscar un libro por ISBN
    
    /*public List<Libro> buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        
    }*/
    
    // ============= Metodo para buscar un libro por ISBN
    public void buscarLibroPorIsbn(String isbn) {
        Libro libroBuscado = null;
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libroBuscado = libro;
                break;
            } 
        }
        if (libroBuscado != null){
            System.out.println("------- Se ha encontrado un libro con ISBN:" + isbn + " -------");
            System.out.println(libroBuscado);
        } else {
            System.out.println("No hay coincidencias para el libro con ISBN: " + isbn);
        }
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion()== anio) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    
    // ============= Metodo para eliminar un libro por ISBN
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = null;
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Se ha eliminado el libro: '"+ libroAEliminar.getTitulo() +"' de la biliocateca.");
        } else {
            System.out.println("No hay coincidencias para el libro con ISBN: " + isbn);
        }
    }
    
    // ============== Metodo para retornar la cantidad de libros que tiene la biblioteca
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public void mostrarAutoresDisponibles() { // Utilizo un set para no repetir autores
        Set<Autor> autores = new HashSet<>();
        for (Libro libro: libros) {
            autores.add(libro.getAutor());
        }
        System.out.println("La biblioteca tiene los siguientes autores: ");
        for (Autor autor : autores) {
            System.out.println(autor.getNombre());
        }
    }
    @Override
    public String toString() {
        return "Biblioteca[" + "Nombre: " + nombre + ", libros: " + libros + ']';
    }  
}
