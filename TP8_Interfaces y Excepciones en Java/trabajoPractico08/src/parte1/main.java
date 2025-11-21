package parte1;

public class main {
    public static void main(String[] args) {
                
       
        Cliente cliente = new Cliente("Ana López");

        
        Producto p1 = new Producto("Mouse Gamer", 15000);
        Producto p2 = new Producto("Teclado Mecánico", 32000);
        Producto p3 = new Producto("Auriculares Bluetooth", 28000);

        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        
        double total = pedido.calcularTotal();
        System.out.println("\n--- PEDIDO CREADO ---");
        System.out.println("Total del pedido sin descuento: $" + total);

      
        PagoConDescuento pago = new PagoTarjetaDeCredito();
        double totalConDescuento = pago.aplicarDescuento(total);
        System.out.println("Total con descuento (10%): $" + totalConDescuento);
        pago.procesarPago(totalConDescuento);

        
        pedido.setEstado("Pagado");
        pedido.setEstado("Enviado");
        pedido.setEstado("Entregado");

        
        System.out.println("\n--- RESUMEN FINAL ---");
        System.out.println(pedido);
    }
    
}
