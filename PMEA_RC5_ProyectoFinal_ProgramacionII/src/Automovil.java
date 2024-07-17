public class Automovil {
    private double valorAutomovil;
    private String tipoServicio;

    public Automovil(double valorAutomovil, String tipoServicio) {
        this.valorAutomovil = valorAutomovil;
        this.tipoServicio = tipoServicio;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
