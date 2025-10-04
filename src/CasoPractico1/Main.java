/*
Caso Practico 1
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // ========= Tarea 1
        System.out.println("------------ Tarea 1 ------------");
        
        Inventario inventario1 = new Inventario();
        
        Producto p1 = new Producto("RR001", "Buzo", 60000, 10, CategoriaProducto.ROPA);
        Producto p2 = new Producto("AA002", "Fideos Marolio", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("EE003", "Computadora HP Victus", 1500000, 2, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("HH004", "Heladera Samsung", 800000, 6, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("EE005", "Parlantes Sony", 700000, 5, CategoriaProducto.ELECTRONICA);
        
        inventario1.agregarProducto(p1);
        inventario1.agregarProducto(p2);
        inventario1.agregarProducto(p3);
        inventario1.agregarProducto(p4);
        inventario1.agregarProducto(p5);
        System.out.println("Productos creados y agregados al inventario.");
        System.out.println("");
        
        // Tarea 2
        System.out.println("------------ Tarea 2 ------------");
        inventario1.listarProductos();
        System.out.println("");
        
        // Tarea 3
        System.out.println("------------ Tarea 3 ------------");
        System.out.println("Se busca en el inventario un producto con id: EE005");
        inventario1.buscarProductoPorId("EE005");
        
        System.out.println("Se busca en el inventario un producto con id: ABC123");
        inventario1.buscarProductoPorId("ABC123");
        System.out.println("");
        
        // Tarea 4
        System.out.println("------------ Tarea 4 ------------");
        System.out.println("Filtrando productos para la categoria: " + CategoriaProducto.ELECTRONICA.getDescripcion());
        ArrayList<Producto> productosElectronicos = inventario1.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        if (productosElectronicos != null) {
            for (Producto productosElectronico : productosElectronicos) {
                System.out.println(productosElectronico);   
            }
            ;
        } else {
            System.out.println("No se han encotnrado productos para la categoria seleccionada.");
        }
        System.out.println("");
        
        // Tarea 5
        System.out.println("------------ Tarea 5 ------------");
        System.out.println("Elimino el producto con id: RR001");
        inventario1.eliminarProducto("RR001");
        inventario1.listarProductos();
        System.out.println("");
        
        // Tarea 6
        System.out.println("------------ Tarea 6 ------------");
        System.out.println("Actualizo el stock del producto con id: EE003");
        inventario1.actualizarStock("EE003", 10);
        inventario1.buscarProductoPorId("EE003");
        System.out.println("");
        
        // Tarea 7
        System.out.println("------------ Tarea 7 ------------");
        System.out.println("El stock total del inventario es: " + inventario1.obtenerTotalStock());
        System.out.println("");
        
        // Tarea 8
        System.out.println("------------ Tarea 8 ------------");
        Producto elQueTieneMasStock = inventario1.obtenerProductoConMayorStock();
        if (elQueTieneMasStock != null) {
            System.out.println("El producto con mayor stock es: " + elQueTieneMasStock);
        } else {
            System.out.println("El inventario no tiene productos.");
        }
        System.out.println("");
        
        // Tarea 9
        System.out.println("------------ Tarea 9 ------------");
        ArrayList<Producto> filtroPrecio = inventario1.filtrarProductosPorPrecio(1000, 3000);
        if (filtroPrecio != null) {
            System.out.println("Los productos con precio entre $1000 y $3000 son: " + filtroPrecio);
        } else {
            System.out.println("El inventario no tiene productos en ese rango de precio.");
        }
        System.out.println("");
        
        // Tarea 10
        System.out.println("------------ Tarea 10 ------------");
        System.out.println("===== Categorias Disponibles =====");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + " (" + categoria.getDescripcion() + ").");
        }
    }
}
