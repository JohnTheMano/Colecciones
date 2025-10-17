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
        
        // Crear productos con diferentes categorías
        Producto p1 = new Producto("1", "Manzana", 50.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Mouse Inalámbrico", 2500.5, 50, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Sillón", 12000.0, 30, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Camiseta", 1500.0, 40, CategoriaProducto.ROPA);
        Producto p5 = new Producto("5", "Auriculares Bluetooth", 2200.0, 15, CategoriaProducto.ELECTRONICA);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("Listado de productos:");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\nBuscar producto por ID (3):");
        Producto productoBuscado = inventario.buscarProductoPorId("3");
        if (productoBuscado != null) {
            System.out.println(productoBuscado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\nFiltrar productos de la categoría ELECTRONICA:");
        inventario.listarProductosPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\nEliminar producto con ID 2:");
        boolean eliminado = inventario.eliminarProductoPorId("2");
        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado para eliminar.");
        }

        System.out.println("\nProductos después de eliminar 2:");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente.
        System.out.println("\nActualizar stock del producto con ID 3 a 50:");
        boolean actualizado = inventario.actualizarStock("3", 50);
        if (actualizado) {
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Producto no encontrado para actualizar.");
        }

        // 7. Mostrar el total de stock disponible.
        System.out.println("\nTotal de stock disponible en el inventario:");
        System.out.println(inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\nProducto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println(mayorStock);

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\nFiltrar productos con precio entre $1000 y $3000:");
        inventario.listarProductosPorRangoDePrecio(1000, 3000);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\nCategorías disponibles con sus descripciones:");
        inventario.mostrarCategoriasDisponibles();
    }
}
