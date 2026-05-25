import java.time.LocalDate;

public class Transaccion {
    private int idTransaccion;
    private String tipoTransaccion;
    private LocalDate fechaTransaccion;
    private double monto;
    private String estado;
    private String banco;
    private String referencia;
    private String moneda;
    private MetodoPago metodoPago;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String tipoTransaccion, LocalDate fechaTransaccion, double monto, String estado, String banco, String referencia, String moneda) {
        this.idTransaccion = idTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.monto = monto;
        this.estado = estado;
        this.banco = banco;
        this.referencia = referencia;
        this.moneda = moneda;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean validarTransaccion() {
        return false;
    }

    public void generarComprobante() {
        System.out.println("Ejecutando generarComprobante");
    }

    public void anularTransaccion() {
        System.out.println("Ejecutando anularTransaccion");
    }
}
