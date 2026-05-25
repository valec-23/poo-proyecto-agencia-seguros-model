import java.time.LocalDate;

public class PagoEfectivo extends MetodoPago {
    private int idPagoEfectivo;
    private String port1;
    private String port2;
    private double montoRecibido;
    private String cajaSucursal;
    private String codigoRecibo;
    private LocalDate fechaPago;
    private String cajeroResponsable;

    public PagoEfectivo() {
    }

    public PagoEfectivo(int idPagoEfectivo, String port1, String port2, double montoRecibido, String cajaSucursal, String codigoRecibo, LocalDate fechaPago, String cajeroResponsable) {
        this.idPagoEfectivo = idPagoEfectivo;
        this.port1 = port1;
        this.port2 = port2;
        this.montoRecibido = montoRecibido;
        this.cajaSucursal = cajaSucursal;
        this.codigoRecibo = codigoRecibo;
        this.fechaPago = fechaPago;
        this.cajeroResponsable = cajeroResponsable;
    }

    public int getIdPagoEfectivo() {
        return idPagoEfectivo;
    }

    public void setIdPagoEfectivo(int idPagoEfectivo) {
        this.idPagoEfectivo = idPagoEfectivo;
    }

    public String getPort1() {
        return port1;
    }

    public void setPort1(String port1) {
        this.port1 = port1;
    }

    public String getPort2() {
        return port2;
    }

    public void setPort2(String port2) {
        this.port2 = port2;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    public String getCajaSucursal() {
        return cajaSucursal;
    }

    public void setCajaSucursal(String cajaSucursal) {
        this.cajaSucursal = cajaSucursal;
    }

    public String getCodigoRecibo() {
        return codigoRecibo;
    }

    public void setCodigoRecibo(String codigoRecibo) {
        this.codigoRecibo = codigoRecibo;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getCajeroResponsable() {
        return cajeroResponsable;
    }

    public void setCajeroResponsable(String cajeroResponsable) {
        this.cajeroResponsable = cajeroResponsable;
    }

    public void registrarPagoEfectivo() {
        System.out.println("Ejecutando registrarPagoEfectivo");
    }

    public double calcularCambio() {
        return 0.0;
    }

    public void emitirRecibo() {
        System.out.println("Ejecutando emitirRecibo");
    }

    public boolean validarMonto() {
        return false;
    }
}
