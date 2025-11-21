package parte1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "Creado";
        this.cliente = cliente;
    }
        

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado();
    }

    public String getEstado() {
        return estado;
    }

    private void notificarCambioEstado() {
        if (cliente != null) {
            cliente.notificar("El estado de su pedido cambió a: " + estado);
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Pedido{"
                + "cliente=" + cliente
                + ", estado='" + estado + '\''
                + ", total=" + calcularTotal()
                + '}';
    }

}
