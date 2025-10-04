/*
Caso Practico 2 - Biblioteca y Libros
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico2;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int aniopublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = aniopublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Año: " + this.anioPublicacion);
        System.out.println(this.autor.toString());
    }

    @Override
    public String toString() {
        return "Libro[" + "ISBN:" + isbn + ", Titulo: " + titulo + ", Año de publicacion: " + anioPublicacion + ", Autor: " + autor + ']';
    }
    
    
    
}
