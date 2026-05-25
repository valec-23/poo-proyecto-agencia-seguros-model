import java.time.LocalDate;

public class Siniestro {
    private int idSiniestro;
    private LocalDate fechaSiniestro;
    private String tipoSiniestro;
    private String descripcion;
    private String ubicacion;
    private double montoEstimado;
    private String estado;
    private String prioridad;

    public Siniestro() {
    }

    public Siniestro(int idSiniestro, LocalDate fechaSiniestro, String tipoSiniestro, String descripcion, String ubicacion, double montoEstimado, String estado, String prioridad) {
        this.idSiniestro = idSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.tipoSiniestro = tipoSiniestro;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.montoEstimado = montoEstimado;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public String getTipoSiniestro() {
        return tipoSiniestro;
    }

    public void setTipoSiniestro(String tipoSiniestro) {
        this.tipoSiniestro = tipoSiniestro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getMontoEstimado() {
        return montoEstimado;
    }

    public void setMontoEstimado(double montoEstimado) {
        this.montoEstimado = montoEstimado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public double calcularPerdida() {
        return 0.0;
    }

    public boolean validarCobertura() {
        return false;
    }

    public void cerrarSiniestro() {
        System.out.println("Ejecutando cerrarSiniestro");
    }
}
