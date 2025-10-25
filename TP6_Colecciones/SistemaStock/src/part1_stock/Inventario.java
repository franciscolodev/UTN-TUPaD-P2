package part1_stock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            this.productos.add(p);
            System.out.println("✅ Producto agregado: " + p.getNombre());
        } else {
            System.out.println("⚠️ Error: Ya existe un producto con ID: " + p.getId());
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("🛒 El inventario está vacío.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DEL INVENTARIO (" + productos.size() + " productos) ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------------------");
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) { 
                return p;
            }
        }
        return null; 
    }

    public boolean eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equalsIgnoreCase(id)) {
                Producto p = productos.remove(i);
                System.out.println("🗑️ Producto eliminado: " + p.getNombre());
                return true;
            }
        }
        System.out.println("❌ Error al eliminar: Producto con ID " + id + " no encontrado.");
        return false;
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄 Stock actualizado para " + p.getNombre() + ". Nuevo stock: " + nuevaCantidad);
        } else {
            System.out.println("❌ Error al actualizar: Producto con ID " + id + " no encontrado.");
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) { return null; }

        Producto mayorStock = productos.get(0); 
        
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) { 
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DE PRODUCTOS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("  - " + cat.name() + ": " + cat.getDescripcion());
        }
        System.out.println("-------------------------------------------");
    }
}
