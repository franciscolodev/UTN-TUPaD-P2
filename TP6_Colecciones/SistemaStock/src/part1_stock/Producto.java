package part1_stock;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }
    public String getNombre() { return nombre; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public void mostrarInfo() {
        System.out.println("-------------------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria + " (" + this.categoria.getDescripcion() + ")");
        System.out.println("-------------------------------------");
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + 
               " | Stock: " + cantidad + " | Categoría: " + categoria;
    }
}
