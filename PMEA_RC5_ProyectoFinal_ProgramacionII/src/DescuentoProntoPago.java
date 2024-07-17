public class DescuentoProntoPago {
    private double porcentajeDescuento;

    public DescuentoProntoPago(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //@Override
    public double calcularDescuento(double valor) {
        return valor - (valor * porcentajeDescuento);
    }
}
