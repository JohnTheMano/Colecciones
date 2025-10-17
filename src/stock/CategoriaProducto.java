package stock;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Constructor
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción de la categoría
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public String toString() {
        return this.descripcion;  // Devuelve la descripción de la categoría.
}

}
