import java.time.LocalDate;

public class TransferenciaBancaria extends MetodoPago {
    private int idTransferencia;
    private String bancoOrigen;
    private String bancoDestino;
    private String numeroCuenta;
    private String codigoTransferencia;
    private LocalDate fechaTransferencia;
    private String estadoTransferencia;

    public TransferenciaBancaria() {
    }

    public TransferenciaBancaria(int idTransferencia, String bancoOrigen, String bancoDestino, String numeroCuenta, String codigoTransferencia, LocalDate fechaTransferencia, String estadoTransferencia) {
        this.idTransferencia = idTransferencia;
        this.bancoOrigen = bancoOrigen;
        this.bancoDestino = bancoDestino;
        this.numeroCuenta = numeroCuenta;
        this.codigoTransferencia = codigoTransferencia;
        this.fechaTransferencia = fechaTransferencia;
        this.estadoTransferencia = estadoTransferencia;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigoTransferencia() {
        return codigoTransferencia;
    }

    public void setCodigoTransferencia(String codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }

    public LocalDate getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(LocalDate fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getEstadoTransferencia() {
        return estadoTransferencia;
    }

    public void setEstadoTransferencia(String estadoTransferencia) {
        this.estadoTransferencia = estadoTransferencia;
    }

    public boolean validarTransferencia() {
        return false;
    }

    public boolean procesarTransferencia() {
        return false;
    }

    public void confirmarDeposito() {
        System.out.println("Ejecutando confirmarDeposito");
    }

    public void generarComprobante() {
        System.out.println("Ejecutando generarComprobante");
    }
}
