public class DescuentoTrasladoCuenta {
    private double porcentajeDescuento;

    public DescuentoTrasladoCuenta(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //@Override
    public double calcularDescuento(double valor) {
        return valor - (valor * porcentajeDescuento);
    }
}
