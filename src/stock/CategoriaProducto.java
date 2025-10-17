package stock;

/**
 * Enum que representa las categorías de productos.
 * 
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles como frutas, verduras, etc."),
    ELECTRONICA("Productos electrónicos como computadoras, teléfonos, etc."),
    ROPA("Productos de vestir como camisetas, pantalones, etc."),
    HOGAR("Artículos para el hogar como muebles, electrodomésticos, etc.");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
