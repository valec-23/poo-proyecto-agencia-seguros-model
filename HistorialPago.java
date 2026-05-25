import java.time.LocalDate;

public class HistorialPago {
    private int idHistorial;
    private LocalDate fechaRegistro;
    private double totalPagado;
    private int pagosPendientes;
    private double moraAcumulada;
    private String estadoFinanciero;

    public HistorialPago() {
    }

    public HistorialPago(int idHistorial, LocalDate fechaRegistro, double totalPagado, int pagosPendientes, double moraAcumulada, String estadoFinanciero) {
        this.idHistorial = idHistorial;
        this.fechaRegistro = fechaRegistro;
        this.totalPagado = totalPagado;
        this.pagosPendientes = pagosPendientes;
        this.moraAcumulada = moraAcumulada;
        this.estadoFinanciero = estadoFinanciero;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public int getPagosPendientes() {
        return pagosPendientes;
    }

    public void setPagosPendientes(int pagosPendientes) {
        this.pagosPendientes = pagosPendientes;
    }

    public double getMoraAcumulada() {
        return moraAcumulada;
    }

    public void setMoraAcumulada(double moraAcumulada) {
        this.moraAcumulada = moraAcumulada;
    }

    public String getEstadoFinanciero() {
        return estadoFinanciero;
    }

    public void setEstadoFinanciero(String estadoFinanciero) {
        this.estadoFinanciero = estadoFinanciero;
    }

    public double calcularDeuda() {
        return 0.0;
    }

    public void actualizarHistorial() {
        System.out.println("Ejecutando actualizarHistorial");
    }

    public String generarReporte() {
        return "";
    }
}
