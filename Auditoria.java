import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Auditoria {
    private int idAuditoria;
    private LocalDate fechaAuditoria;
    private String auditorResponsable;
    private String observaciones;
    private String estado;
    private String nivelRiesgo;
    private String accionesCorrectivas;
    private List<Reclamo> reclamoList = new ArrayList<>();

    public Auditoria() {
    }

    public Auditoria(int idAuditoria, LocalDate fechaAuditoria, String auditorResponsable, String observaciones, String estado, String nivelRiesgo, String accionesCorrectivas) {
        this.idAuditoria = idAuditoria;
        this.fechaAuditoria = fechaAuditoria;
        this.auditorResponsable = auditorResponsable;
        this.observaciones = observaciones;
        this.estado = estado;
        this.nivelRiesgo = nivelRiesgo;
        this.accionesCorrectivas = accionesCorrectivas;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public LocalDate getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(LocalDate fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }

    public String getAuditorResponsable() {
        return auditorResponsable;
    }

    public void setAuditorResponsable(String auditorResponsable) {
        this.auditorResponsable = auditorResponsable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public String getAccionesCorrectivas() {
        return accionesCorrectivas;
    }

    public void setAccionesCorrectivas(String accionesCorrectivas) {
        this.accionesCorrectivas = accionesCorrectivas;
    }

    public List<Reclamo> getReclamoList() {
        return reclamoList;
    }

    public void setReclamoList(List<Reclamo> reclamoList) {
        this.reclamoList = reclamoList;
    }

    public void registrarAuditoria() {
        System.out.println("Ejecutando registrarAuditoria");
    }

    public String generarInforme() {
        return "";
    }

    public void cerrarAuditoria() {
        System.out.println("Ejecutando cerrarAuditoria");
    }
}
