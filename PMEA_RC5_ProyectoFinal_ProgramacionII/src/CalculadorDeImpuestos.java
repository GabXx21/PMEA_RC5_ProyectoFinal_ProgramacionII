public class CalculadorDeImpuestos {
    private Automovil automovil;
    private double totalImpuestos;

    public CalculadorDeImpuestos(Automovil automovil) {
        this.automovil = automovil;
    }

    public double calcularImpuesto() {
        totalImpuestos = automovil.getValorAutomovil() * 0.1; // Suponiendo un 10% de impuestos base
        aplicarDescuentoProntoPago();
        aplicarDescuentoServicioPublico();
        aplicarDescuentoTrasladoCuenta();
        return totalImpuestos;
    }

    private void aplicarDescuentoProntoPago() {
        totalImpuestos -= totalImpuestos * 0.05; // 5% de descuento por pronto pago
    }

    private void aplicarDescuentoServicioPublico() {
        if (automovil.getTipoServicio().equals("publico")) {
            totalImpuestos -= 500; // Descuento fijo de 500 por servicio público
        }
    }

    private void aplicarDescuentoTrasladoCuenta() {
        totalImpuestos -= totalImpuestos * 0.1; // 10% de descuento por traslado de cuenta
    }
}