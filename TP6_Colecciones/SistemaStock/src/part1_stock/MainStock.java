package part1_stock;

import java.util.ArrayList;

public class MainStock {
    public static void main(String[] args) {
        
        System.out.println("=================================================");
        System.out.println("=== INICIO CASO 1: SISTEMA DE STOCK Y ENUMS ===");
        System.out.println("=================================================");
        
        Inventario miInventario = new Inventario();

        // TAREA 1: Crear y agregar al menos 5 productos
        System.out.println("\n--- TAREA 1: AGREGAR PRODUCTOS ---");
        miInventario.agregarProducto(new Producto("P001", "Manzanas kg", 850.50, 50, CategoriaProducto.ALIMENTOS));
        miInventario.agregarProducto(new Producto("P002", "Smart TV 50'", 250000.00, 5, CategoriaProducto.ELECTRONICA));
        miInventario.agregarProducto(new Producto("P003", "Pantalón Jean", 3500.00, 20, CategoriaProducto.ROPA));
        miInventario.agregarProducto(new Producto("P004", "Licuadora", 15000.00, 15, CategoriaProducto.HOGAR));
        miInventario.agregarProducto(new Producto("P005", "Zapatillas Deportivas", 18000.00, 20, CategoriaProducto.ROPA));
        miInventario.agregarProducto(new Producto("P006", "Cereal Desayuno", 1200.00, 80, CategoriaProducto.ALIMENTOS));
        
        
        // TAREA 2: Listar todos los productos
        miInventario.listarProductos();

        // TAREA 3: Buscar un producto por ID y mostrar su info
        System.out.println("\n--- TAREA 3: BUSCAR PRODUCTO P002 ---");
        Producto productoBuscado = miInventario.buscarProductoPorId("P002");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        // TAREA 4: Filtrar por una categoría específica
        System.out.println("\n--- TAREA 4: FILTRAR POR CATEGORÍA ROPA ---");
        ArrayList<Producto> ropa = miInventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto p : ropa) { System.out.println(" [Filtro ROPA] " + p); }
        
        // TAREA 5: Eliminar un producto por su ID
        System.out.println("\n--- TAREA 5: ELIMINAR PRODUCTO P004 ---");
        miInventario.eliminarProducto("P004");
        miInventario.listarProductos(); // Listar restantes
        
        // TAREA 6: Actualizar el stock de un producto
        System.out.println("\n--- TAREA 6: ACTUALIZAR STOCK P002 ---");
        miInventario.actualizarStock("P002", 10);
        
        // TAREA 7: Mostrar el total de stock disponible
        System.out.println("\n--- TAREA 7: TOTAL DE STOCK ---");
        System.out.println("Stock Total en el inventario: " + miInventario.obtenerTotalStock());
        
        // TAREA 8: Obtener el producto con mayor stock
        System.out.println("\n--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto masStock = miInventario.obtenerProductoConMayorStock();
        if (masStock != null) {
            System.out.println("El producto con mayor stock es: " + masStock.getNombre() + " (" + masStock.getCantidad() + " unidades)");
        }
        
        // TAREA 9: Filtrar productos con precios entre $1000 y $3000
        System.out.println("\n--- TAREA 9: FILTRAR POR RANGO DE PRECIO ($1000 - $3000) ---");
        ArrayList<Producto> filtradosPrecio = miInventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        for (Producto p : filtradosPrecio) { System.out.println(" [Rango Precio] " + p); }

        // TAREA 10: Mostrar las categorías disponibles
        miInventario.mostrarCategoriasDisponibles();
        
        System.out.println("\n=================================================");
        System.out.println("=== FIN CASO 1 ===");
        System.out.println("=================================================");
    }
}
