/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Win
**/

//Clase principal para ejecutar pruebas con el inventario de productos.

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        // Crear algunos productos
        Producto p1 = new Producto("P001", "Manzana", 50.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Mouse Inalámbrico", 250.5, 50, CategoriaProducto.ELECTRONICA);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        // Listar productos
        inventario.listarProductos();

        // Buscar un producto
        Producto encontrado = inventario.buscarProductoPorId("P002");
        System.out.println("Producto encontrado: " + encontrado);

        // Actualizar stock
        inventario.actualizarStock("P002", 60);

        // Eliminar un producto
        inventario.eliminarProductoPorId("P001");

        // Listar productos después de eliminación
        System.out.println("Productos después de eliminar P001:");
        inventario.listarProductos();
        
        // Obtener total de stock
        System.out.println("Total de stock: " + inventario.obtenerTotalStock());
        
        // Obtener producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock: " + mayorStock);
    }
}
