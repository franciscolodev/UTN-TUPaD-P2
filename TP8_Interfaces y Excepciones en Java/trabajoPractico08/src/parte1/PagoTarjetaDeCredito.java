package parte1;

public class PagoTarjetaDeCredito implements PagoConDescuento{
    
    @Override
    public double aplicarDescuento(double monto){
        return monto * 0.9;
    }
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago con tarjeta por $" + monto);
    }
}
