import java.time.LocalDate;

public class RecomendacionDigital {
    private int idRecomendacion;
    private String descripcion;
    private String prioridad;
    private LocalDate fechaGeneracion;
    private String estado;
    private String impactoEsperado;
    private String responsable;

    public RecomendacionDigital() {
    }

    public RecomendacionDigital(int idRecomendacion, String descripcion, String prioridad, LocalDate fechaGeneracion, String estado, String impactoEsperado, String responsable) {
        this.idRecomendacion = idRecomendacion;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaGeneracion = fechaGeneracion;
        this.estado = estado;
        this.impactoEsperado = impactoEsperado;
        this.responsable = responsable;
    }

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImpactoEsperado() {
        return impactoEsperado;
    }

    public void setImpactoEsperado(String impactoEsperado) {
        this.impactoEsperado = impactoEsperado;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void implementarRecomendacion() {
        System.out.println("Ejecutando implementarRecomendacion");
    }

    public double calcularImpacto() {
        return 0.0;
    }

    public String generarSeguimiento() {
        return "";
    }
}
