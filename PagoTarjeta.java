import java.time.LocalDate;

public class PagoTarjeta extends MetodoPago {
    private int idPagoTarjeta;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private String bancoEmisor;
    private String cvv;
    private LocalDate fechaExpiracion;
    private String titularTarjeta;

    public PagoTarjeta() {
    }

    public PagoTarjeta(int idPagoTarjeta, String numeroTarjeta, String tipoTarjeta, String bancoEmisor, String cvv, LocalDate fechaExpiracion, String titularTarjeta) {
        this.idPagoTarjeta = idPagoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.bancoEmisor = bancoEmisor;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
        this.titularTarjeta = titularTarjeta;
    }

    public int getIdPagoTarjeta() {
        return idPagoTarjeta;
    }

    public void setIdPagoTarjeta(int idPagoTarjeta) {
        this.idPagoTarjeta = idPagoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public boolean validarTarjeta() {
        return false;
    }

    public boolean procesarPagoTarjeta() {
        return false;
    }

    public void generarVoucher() {
        System.out.println("Ejecutando generarVoucher");
    }

    public boolean verificarFondos() {
        return false;
    }
}
