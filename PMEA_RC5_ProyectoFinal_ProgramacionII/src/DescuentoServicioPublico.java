public class DescuentoServicioPublico {
    private double valorDescuento;

    public DescuentoServicioPublico(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    //@Override
    public double calcularDescuento(double valor) {
        return valor - valorDescuento;
    }
}