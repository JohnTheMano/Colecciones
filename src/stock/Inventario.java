/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;  // Colección para almacenar productos

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Método para listar todos los productos en el inventario
    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
            System.out.println("------------------------------------------");
        }
    }

    // Método para buscar un producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;  // Si encontramos el producto, lo retornamos
            }
        }
        return null;  // Si no lo encontramos, devolvemos null
    }

    // Método para eliminar un producto por ID
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto con ID " + id + " ha sido eliminado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    // Método para actualizar el stock de un producto
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("El stock del producto con ID " + id + " ha sido actualizado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    // Método para filtrar productos por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                System.out.println("------------------------------------------");
            }
        }
    }

    // Método para obtener el total de stock disponible
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Método para obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        Producto maxStockProducto = null;
        int maxStock = 0;
        for (Producto p : productos) {
            if (p.getCantidad() > maxStock) {
                maxStockProducto = p;
                maxStock = p.getCantidad();
            }
        }
        return maxStockProducto;
    }

    // Método para filtrar productos por precio
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                System.out.println("------------------------------------------");
            }
        }
    }

    // Método para mostrar todas las categorías disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    }
}
