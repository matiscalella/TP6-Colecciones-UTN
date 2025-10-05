/*
Caso Practico 1
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico1;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }

    public String getId() {
        return id;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    } 
}
