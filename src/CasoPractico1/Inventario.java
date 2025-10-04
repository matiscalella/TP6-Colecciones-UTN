/*
Caso Practico 1
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    // ========= Metodos ========= 
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println("=============== INVENTARIO DE PRODUCTOS ===============");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("========================================================");
    }
    
    // ----- Metodo para buscar un producto utilizando un For-Each
    public void buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productoEncontrado = producto;
                break;
            }
        }
        if (productoEncontrado != null) {
            System.out.println("Producto con id: " + id + " encontrado.");
            System.out.println("---- INFORMACION DEL PRODUCTO ----");
            System.out.println(productoEncontrado);
        } else {
            System.out.println("Producto con id: " + id + " NO encontrado:");
        }
    }
    
    // ----- Metodo para buscar un producto utilizando un While
    /*
    int i = 0;
    Producto productoEncontrado = null;

    while (i < productos.size() && productoEncontrado == null) {
        Producto actual = productos.get(i);
        if (actual.getId().equals(id)) {
            productoEncontrado = actual;
        }
        i++;
    }
    */
    
    // ----- Metodo para eliminar un producto buscado por id
    public void eliminarProducto(String id) {
        Producto productoAEliminar = null;
        
        for (Producto producto : productos) {
            if (producto.getId().equals(id)){
                productoAEliminar = producto;
                break;
            }
        }
        if (productoAEliminar != null){
            productos.remove(productoAEliminar);
            System.out.println("Se elimino correctamente el producto con id: " + id + ".");
        } else {
            System.out.println("No se encontro un producto con id: " + id + ".");
        }
    }
    
    // ----- Metodo para actualizar el stock de un producto
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto actualizar = null;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)){
                actualizar = producto;
                break;
            }
        }
        if (actualizar != null) {
                actualizar.setCantidad(nuevaCantidad);
                System.out.println("Nuevo stock actualizado para producto (con id" + id + "): " + nuevaCantidad);
            } else {
                System.out.println("No se encontro un producto con id: " + id + ".");
            }
    }
    
    // ---- Metodo para filtrar productos de una misma categoria - que retorna una lista
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)){
                  filtrados.add(producto);
            }
        }
        return filtrados;
    }
    
    // ----- Metodo para calcular el total de stock
    public int obtenerTotalStock(){
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }
    
    //----- Metodo para calcular el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        int elMayorStock = 0;
        Producto elProductoDeMayorStock = null;
        for (Producto producto : productos) {
            if (producto.getCantidad() > elMayorStock) {
                elMayorStock = producto.getCantidad();
                elProductoDeMayorStock = producto;
            }
        }
        return elProductoDeMayorStock;
    }
    
    // ----- Metodo para calcular el total de stock
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }
    
    /*
    // Metodos pendientes
        
        
        
        mostrarCategoriasDisponibles()
    */
}
