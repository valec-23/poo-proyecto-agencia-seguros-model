import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reclamo {
    private int idReclamo;
    private String numeroReclamo;
    private LocalDate fechaReclamo;
    private String tipoReclamo;
    private String descripcion;
    private double montoSolicitado;
    private String estado;
    private String nivelRiesgo;
    private boolean fraudeDetectado;
    private LocalDate fechaResolucion;
    private String observaciones;
    private Siniestro siniestro;
    private List<Documento> documentoList = new ArrayList<>();
    private ValidacionFraude validacionFraude;
    private AnalisisFinanciero analisisFinanciero;
    private ChatbotSoporte chatbotSoporte;
    private InspeccionAutomatizada inspeccionAutomatizada;

    public Reclamo() {
    }

    public Reclamo(int idReclamo, String numeroReclamo, LocalDate fechaReclamo, String tipoReclamo, String descripcion, double montoSolicitado, String estado, String nivelRiesgo, boolean fraudeDetectado, LocalDate fechaResolucion, String observaciones) {
        this.idReclamo = idReclamo;
        this.numeroReclamo = numeroReclamo;
        this.fechaReclamo = fechaReclamo;
        this.tipoReclamo = tipoReclamo;
        this.descripcion = descripcion;
        this.montoSolicitado = montoSolicitado;
        this.estado = estado;
        this.nivelRiesgo = nivelRiesgo;
        this.fraudeDetectado = fraudeDetectado;
        this.fechaResolucion = fechaResolucion;
        this.observaciones = observaciones;
    }

    public int getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(String numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public LocalDate getFechaReclamo() {
        return fechaReclamo;
    }

    public void setFechaReclamo(LocalDate fechaReclamo) {
        this.fechaReclamo = fechaReclamo;
    }

    public String getTipoReclamo() {
        return tipoReclamo;
    }

    public void setTipoReclamo(String tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public boolean isFraudeDetectado() {
        return fraudeDetectado;
    }

    public void setFraudeDetectado(boolean fraudeDetectado) {
        this.fraudeDetectado = fraudeDetectado;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Siniestro getSiniestro() {
        return siniestro;
    }

    public void setSiniestro(Siniestro siniestro) {
        this.siniestro = siniestro;
    }

    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    public ValidacionFraude getValidacionFraude() {
        return validacionFraude;
    }

    public void setValidacionFraude(ValidacionFraude validacionFraude) {
        this.validacionFraude = validacionFraude;
    }

    public AnalisisFinanciero getAnalisisFinanciero() {
        return analisisFinanciero;
    }

    public void setAnalisisFinanciero(AnalisisFinanciero analisisFinanciero) {
        this.analisisFinanciero = analisisFinanciero;
    }

    public ChatbotSoporte getChatbotSoporte() {
        return chatbotSoporte;
    }

    public void setChatbotSoporte(ChatbotSoporte chatbotSoporte) {
        this.chatbotSoporte = chatbotSoporte;
    }

    public InspeccionAutomatizada getInspeccionAutomatizada() {
        return inspeccionAutomatizada;
    }

    public void setInspeccionAutomatizada(InspeccionAutomatizada inspeccionAutomatizada) {
        this.inspeccionAutomatizada = inspeccionAutomatizada;
    }

    public String calcularRiesgo() {
        return "";
    }

    public boolean validarMonto() {
        return false;
    }

    public void aprobarReclamo() {
        System.out.println("Ejecutando aprobarReclamo");
    }

    public void rechazarReclamo() {
        System.out.println("Ejecutando rechazarReclamo");
    }

    public void generarAlerta() {
        System.out.println("Ejecutando generarAlerta");
    }

    public boolean detectarFraude() {
        return false;
    }
}
