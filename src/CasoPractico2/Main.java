/*
Caso Practico 2 - Biblioteca y Libros
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarea 1
        System.out.println(" ------------ Tarea 1 - Crear biblioteca ------------ ");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional Mariano Moreno");
        System.out.println(biblioteca);
        System.out.println("");
        
        // Tarea 2
        System.out.println(" ------------ Tarea 2 - Agregar 3 autores ------------ ");
        Autor a1 = new Autor("RG1886", "Ricardo Guiraldes", "Argentina");
        Autor a2 = new Autor("AS1891", "Alfonsina Storni", "Argentina");
        Autor a3 = new Autor("JV1920", "Jose Mauro de Vasconcelos", "Brasilera");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("");
        
        // Tarea 3
        System.out.println(" ------------ Tarea 3 - Agregar 5 libros ------------ ");
        biblioteca.agregarLibro("9780080170091", "Don Segundo Sombra", 1926, a1);
        biblioteca.agregarLibro("8596547828556", "Xaimaca", 1923, a1);
        biblioteca.agregarLibro("9786599114328", "Antologia Poetica", 1938, a2);
        biblioteca.agregarLibro("9788506086506", "Vamos a Calentar el Sol", 1974, a3);
        biblioteca.agregarLibro("9788506043660", "Mi planta de Naranja Lima", 1968, a3);
        System.out.println("");
        
        // Tarea 4
        System.out.println(" ------------ Tarea 4 - Listar los libros ------------ ");
        biblioteca.listarLibros();
        System.out.println("");
        
        // Tarea 5
        System.out.println(" ------------ Tarea 5 - Buscar un libro por ISBN ------------ ");
        biblioteca.buscarLibroPorIsbn("9780080170091");
        System.out.println("");
        
        // Tarea 6
        System.out.println(" ------------ Tarea 6 - Buscar libros por un año especifico ------------ ");
        List<Libro> libros1926 = biblioteca.filtrarLibrosPorAnio(1926);
        if (libros1926 != null) {
            System.out.println("Libros encontrados para el año 1926: ");
            System.out.println(libros1926);
        } else {
            System.out.println("No se han encontrado libros para el año 1926.");
        }
        System.out.println("");
        
        // Tarea 7
        System.out.println(" ------------ Tarea 7 - Eliminar  un libro por ISBN y mostrar los libros restantes ------------ ");
        biblioteca.eliminarLibro("9788506086506");
        biblioteca.listarLibros();
        System.out.println("");
        
        // Tarea 8
        System.out.println(" ------------ Tarea 8 - Mostrar la cantidad de libros que hay en la biblioteca ------------ ");
        System.out.println("La biblioteca tiene: " + biblioteca.obtenerCantidadLibros() + " libros.");
        System.out.println("");
        
        // Tarea 9
        System.out.println(" ------------ Tarea 9 - Listar todos los autores que tiene la biblioteca ------------ ");
        biblioteca.mostrarAutoresDisponibles();
        
    }
}
