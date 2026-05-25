import java.time.LocalDate;

public class AlertaFraude {
    private int idAlerta;
    private String tipoAlerta;
    private String descripcion;
    private String nivelCriticidad;
    private LocalDate fechaGeneracion;
    private String estado;
    private String accionTomada;

    public AlertaFraude() {
    }

    public AlertaFraude(int idAlerta, String tipoAlerta, String descripcion, String nivelCriticidad, LocalDate fechaGeneracion, String estado, String accionTomada) {
        this.idAlerta = idAlerta;
        this.tipoAlerta = tipoAlerta;
        this.descripcion = descripcion;
        this.nivelCriticidad = nivelCriticidad;
        this.fechaGeneracion = fechaGeneracion;
        this.estado = estado;
        this.accionTomada = accionTomada;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelCriticidad() {
        return nivelCriticidad;
    }

    public void setNivelCriticidad(String nivelCriticidad) {
        this.nivelCriticidad = nivelCriticidad;
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

    public String getAccionTomada() {
        return accionTomada;
    }

    public void setAccionTomada(String accionTomada) {
        this.accionTomada = accionTomada;
    }

    public void enviarAlerta() {
        System.out.println("Ejecutando enviarAlerta");
    }

    public void escalarCaso() {
        System.out.println("Ejecutando escalarCaso");
    }

    public void cerrarAlerta() {
        System.out.println("Ejecutando cerrarAlerta");
    }
}
