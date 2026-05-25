import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Poliza {
    private int idPoliza;
    private String numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estadoPoliza;
    private double montoAsegurado;
    private double primaMensual;
    private String tipoPoliza;
    private boolean renovacionAutomatica;
    private List<Reclamo> reclamoList = new ArrayList<>();
    private Cobertura cobertura;

    public Poliza() {
    }

    public Poliza(int idPoliza, String numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin, String estadoPoliza, double montoAsegurado, double primaMensual, String tipoPoliza, boolean renovacionAutomatica) {
        this.idPoliza = idPoliza;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoPoliza = estadoPoliza;
        this.montoAsegurado = montoAsegurado;
        this.primaMensual = primaMensual;
        this.tipoPoliza = tipoPoliza;
        this.renovacionAutomatica = renovacionAutomatica;
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(String estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public double getPrimaMensual() {
        return primaMensual;
    }

    public void setPrimaMensual(double primaMensual) {
        this.primaMensual = primaMensual;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public boolean isRenovacionAutomatica() {
        return renovacionAutomatica;
    }

    public void setRenovacionAutomatica(boolean renovacionAutomatica) {
        this.renovacionAutomatica = renovacionAutomatica;
    }

    public List<Reclamo> getReclamoList() {
        return reclamoList;
    }

    public void setReclamoList(List<Reclamo> reclamoList) {
        this.reclamoList = reclamoList;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPrima() {
        return 0.0;
    }

    public boolean verificarVigencia() {
        return false;
    }

    public void renovarPoliza() {
        System.out.println("Ejecutando renovarPoliza");
    }

    public void cancelarPoliza() {
        System.out.println("Ejecutando cancelarPoliza");
    }
}
