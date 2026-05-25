import java.time.LocalDate;

public class InspeccionAutomatizada {
    private int idInspeccion;
    private String tipoAnalisis;
    private String resultadoIA;
    private double porcentajeDanio;
    private LocalDate fechaAnalisis;

    public InspeccionAutomatizada() {
    }

    public InspeccionAutomatizada(int idInspeccion, String tipoAnalisis, String resultadoIA, double porcentajeDanio, LocalDate fechaAnalisis) {
        this.idInspeccion = idInspeccion;
        this.tipoAnalisis = tipoAnalisis;
        this.resultadoIA = resultadoIA;
        this.porcentajeDanio = porcentajeDanio;
        this.fechaAnalisis = fechaAnalisis;
    }

    public int getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(int idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public String getTipoAnalisis() {
        return tipoAnalisis;
    }

    public void setTipoAnalisis(String tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public String getResultadoIA() {
        return resultadoIA;
    }

    public void setResultadoIA(String resultadoIA) {
        this.resultadoIA = resultadoIA;
    }

    public double getPorcentajeDanio() {
        return porcentajeDanio;
    }

    public void setPorcentajeDanio(double porcentajeDanio) {
        this.porcentajeDanio = porcentajeDanio;
    }

    public LocalDate getFechaAnalisis() {
        return fechaAnalisis;
    }

    public void setFechaAnalisis(LocalDate fechaAnalisis) {
        this.fechaAnalisis = fechaAnalisis;
    }

    public void analizarImagenes() {
        System.out.println("Ejecutando analizarImagenes");
    }

    public boolean detectarDanios() {
        return false;
    }

    public double calcularRiesgo() {
        return 0.0;
    }
}
