import java.time.LocalDate;

public class PagoPrima {
    private int idPago;
    private LocalDate fechaPago;
    private double monto;
    private String metodoPago;
    private String estadoPago;
    private String referenciaBancaria;
    private String observaciones;
    private String attribute3;

    public PagoPrima() {
    }

    public PagoPrima(int idPago, LocalDate fechaPago, double monto, String metodoPago, String estadoPago, String referenciaBancaria, String observaciones, String attribute3) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
        this.referenciaBancaria = referenciaBancaria;
        this.observaciones = observaciones;
        this.attribute3 = attribute3;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getReferenciaBancaria() {
        return referenciaBancaria;
    }

    public void setReferenciaBancaria(String referenciaBancaria) {
        this.referenciaBancaria = referenciaBancaria;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public boolean validarPago() {
        return false;
    }

    public double calcularMora() {
        return 0.0;
    }

    public void generarComprobante() {
        System.out.println("Ejecutando generarComprobante");
    }
}
