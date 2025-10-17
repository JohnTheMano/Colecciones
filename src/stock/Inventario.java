/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

import java.util.ArrayList;
import java.util.List;


public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    // Método para listar todos los productos en el inventario
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Buscar un producto por su ID
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;  // Si no se encuentra el producto
    }

    // Eliminar producto por ID
    public boolean eliminarProductoPorId(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            return true;
        }
        return false;
    }

    // Actualizar el stock de un producto
    public boolean actualizarStock(String id, int nuevoStock) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevoStock);
            return true;
        }
        return false;
    }

    // Mostrar el total de stock disponible
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    // Obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        Producto productoConMayorStock = null;
        for (Producto producto : productos) {
            if (productoConMayorStock == null || producto.getCantidad() > productoConMayorStock.getCantidad()) {
                productoConMayorStock = producto;
            }
        }
        return productoConMayorStock;
    }
    
    // Filtrar y mostrar productos que pertenezcan a una categoría específica.
    public void listarProductosPorCategoria(CategoriaProducto categoria) {
    for (Producto producto : productos) {
        if (producto.getCategoria() == categoria) {
            System.out.println(producto);
        }
    }
}
}