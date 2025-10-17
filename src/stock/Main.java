/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Win
 */
public class Main {
    public static void main(String[] args) {
        
        
        Producto p1 = new Producto("1", "Manzana", 50.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Mouse Inalámbrico", 250.50, 50, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Sillón", 23500, 30, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Camiseta", 1200.0, 40, CategoriaProducto.ROPA);
        Producto p5 = new Producto("5", "Radio AM/FM", 22000.0, 15, CategoriaProducto.ELECTRONICA);
        
        
        p1.mostrarInfo();
        System.out.println("------------------------------------------");
        p2.mostrarInfo();
        System.out.println("------------------------------------------");
        p3.mostrarInfo();
        
        // Crear el inventario
        Inventario inventario = new Inventario();
        
        // 1. Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos los productos mostrando su información y categoría
        System.out.println("------------------------------------------");
        System.out.println("Listado de productos:");
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID y mostrar su información
        Producto productoBuscado = inventario.buscarProductoPorId("1");
        if (productoBuscado != null) {
            System.out.println("\nProducto con ID 1 encontrado:");
            System.out.println(productoBuscado);
        } else {
            System.out.println("Producto con ID 1 no encontrado.");
        }
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica
        System.out.println("\nFiltrar productos por categoría ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        
        // 5. Eliminar un producto por su ID y listar los productos restantes
        System.out.println("\nEliminamos producto con ID 3:");
        inventario.eliminarProducto("3");
        System.out.println("Productos después de eliminar el ID 3:");
        inventario.listarProductos();
        
        // 6. Actualizar el stock de un producto existente
        System.out.println("\nActualizamos el stock del producto con ID 2 a 60:");
        inventario.actualizarStock("2", 60);
        inventario.listarProductos();  // Ver los cambios
        
        // 7. Mostrar el total de stock disponible
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());
        
        // 8. Obtener y mostrar el producto con mayor stock
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock:");
        System.out.println(productoMayorStock);
        
        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println("\nFiltrar productos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar las categorías disponibles con sus descripciones
        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    
    }
            
}
