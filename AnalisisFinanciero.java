import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnalisisFinanciero {
    private int idAnalisis;
    private double montoPerdidas;
    private double montoRecuperado;
    private double indiceFraude;
    private int totalReclamos;
    private double porcentajeFraude;
    private LocalDate fechaAnalisis;
    private String riesgoFinanciero;
    private List<Transaccion> transaccionList = new ArrayList<>();
    private List<IndicadorDashboard> indicadorDashboardList = new ArrayList<>();

    public AnalisisFinanciero() {
    }

    public AnalisisFinanciero(int idAnalisis, double montoPerdidas, double montoRecuperado, double indiceFraude, int totalReclamos, double porcentajeFraude, LocalDate fechaAnalisis, String riesgoFinanciero) {
        this.idAnalisis = idAnalisis;
        this.montoPerdidas = montoPerdidas;
        this.montoRecuperado = montoRecuperado;
        this.indiceFraude = indiceFraude;
        this.totalReclamos = totalReclamos;
        this.porcentajeFraude = porcentajeFraude;
        this.fechaAnalisis = fechaAnalisis;
        this.riesgoFinanciero = riesgoFinanciero;
    }

    public int getIdAnalisis() {
        return idAnalisis;
    }

    public void setIdAnalisis(int idAnalisis) {
        this.idAnalisis = idAnalisis;
    }

    public double getMontoPerdidas() {
        return montoPerdidas;
    }

    public void setMontoPerdidas(double montoPerdidas) {
        this.montoPerdidas = montoPerdidas;
    }

    public double getMontoRecuperado() {
        return montoRecuperado;
    }

    public void setMontoRecuperado(double montoRecuperado) {
        this.montoRecuperado = montoRecuperado;
    }

    public double getIndiceFraude() {
        return indiceFraude;
    }

    public void setIndiceFraude(double indiceFraude) {
        this.indiceFraude = indiceFraude;
    }

    public int getTotalReclamos() {
        return totalReclamos;
    }

    public void setTotalReclamos(int totalReclamos) {
        this.totalReclamos = totalReclamos;
    }

    public double getPorcentajeFraude() {
        return porcentajeFraude;
    }

    public void setPorcentajeFraude(double porcentajeFraude) {
        this.porcentajeFraude = porcentajeFraude;
    }

    public LocalDate getFechaAnalisis() {
        return fechaAnalisis;
    }

    public void setFechaAnalisis(LocalDate fechaAnalisis) {
        this.fechaAnalisis = fechaAnalisis;
    }

    public String getRiesgoFinanciero() {
        return riesgoFinanciero;
    }

    public void setRiesgoFinanciero(String riesgoFinanciero) {
        this.riesgoFinanciero = riesgoFinanciero;
    }

    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    public List<IndicadorDashboard> getIndicadorDashboardList() {
        return indicadorDashboardList;
    }

    public void setIndicadorDashboardList(List<IndicadorDashboard> indicadorDashboardList) {
        this.indicadorDashboardList = indicadorDashboardList;
    }

    public double calcularPerdidas() {
        return 0.0;
    }

    public void generarIndicadores() {
        System.out.println("Ejecutando generarIndicadores");
    }

    public double calcularIndiceRiesgo() {
        return 0.0;
    }

    public String generarReporteFinanciero() {
        return "";
    }
}
