/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Win
 */
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor por defecto
    public Producto() {
        this.id = "";
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
        this.categoria = CategoriaProducto.ALIMENTOS; // Valor por defecto
    }

    // Constructor sobrecargado con valores predeterminados para cantidad y categoria
    public Producto(String id, String nombre, double precio) {
        this(id, nombre, precio, 0, CategoriaProducto.ALIMENTOS);  // Usamos otro constructor
    }

    // Constructor completo que permite personalizar todos los valores
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Métodos getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    // Método toString para representación de producto
    @Override
    public String toString() {
        return "Producto{" +
               "ID='" + id + '\'' +
               ", Nombre='" + nombre + '\'' +
               ", Precio=" + precio +
               ", Cantidad=" + cantidad +
               ", Categoría=" + categoria +  // Mostramos la categoría
               '}';
    }
}