import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ValidacionFraude {
    private int idValidacion;
    private String tipoValidacion;
    private String descripcion;
    private String nivelSospecha;
    private LocalDate fechaValidacion;
    private String resultado;
    private double porcentajeFraude;
    private boolean estado;
    private List<AlertaFraude> alertaFraudeList = new ArrayList<>();
    private ProcesoDigital procesoDigital;

    public ValidacionFraude() {
    }

    public ValidacionFraude(int idValidacion, String tipoValidacion, String descripcion, String nivelSospecha, LocalDate fechaValidacion, String resultado, double porcentajeFraude, boolean estado) {
        this.idValidacion = idValidacion;
        this.tipoValidacion = tipoValidacion;
        this.descripcion = descripcion;
        this.nivelSospecha = nivelSospecha;
        this.fechaValidacion = fechaValidacion;
        this.resultado = resultado;
        this.porcentajeFraude = porcentajeFraude;
        this.estado = estado;
    }

    public int getIdValidacion() {
        return idValidacion;
    }

    public void setIdValidacion(int idValidacion) {
        this.idValidacion = idValidacion;
    }

    public String getTipoValidacion() {
        return tipoValidacion;
    }

    public void setTipoValidacion(String tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelSospecha() {
        return nivelSospecha;
    }

    public void setNivelSospecha(String nivelSospecha) {
        this.nivelSospecha = nivelSospecha;
    }

    public LocalDate getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(LocalDate fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPorcentajeFraude() {
        return porcentajeFraude;
    }

    public void setPorcentajeFraude(double porcentajeFraude) {
        this.porcentajeFraude = porcentajeFraude;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<AlertaFraude> getAlertaFraudeList() {
        return alertaFraudeList;
    }

    public void setAlertaFraudeList(List<AlertaFraude> alertaFraudeList) {
        this.alertaFraudeList = alertaFraudeList;
    }

    public ProcesoDigital getProcesoDigital() {
        return procesoDigital;
    }

    public void setProcesoDigital(ProcesoDigital procesoDigital) {
        this.procesoDigital = procesoDigital;
    }

    public void analizarPatron() {
        System.out.println("Ejecutando analizarPatron");
    }

    public boolean validarDuplicidad() {
        return false;
    }

    public boolean detectarMontoExcesivo() {
        return false;
    }

    public String generarResultado() {
        return "";
    }

    public double calcularProbabilidadFraude() {
        return 0.0;
    }
}
