/*
Caso Practico 1
Trabajo Práctico 6: Colecciones y Sistema de Stock
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package CasoPractico1;

public enum CategoriaProducto {
    
        ALIMENTOS("Productos comestibles"),
        ELECTRONICA("Dispositivos electrónicos"),
        ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar"); 
        
        private final String descripcion;
        
        CategoriaProducto(String descripcion) {
            this.descripcion = descripcion;
        }
    
    public String getDescripcion() { 
        return descripcion;
    }
  
}
