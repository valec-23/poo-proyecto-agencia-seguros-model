import java.time.LocalDate;

public class PortalAutogestion {
    private int idPortal;
    private String urlPortal;
    private boolean estado;
    private int usuariosActivos;
    private LocalDate fechaActualizacion;

    public PortalAutogestion() {
    }

    public PortalAutogestion(int idPortal, String urlPortal, boolean estado, int usuariosActivos, LocalDate fechaActualizacion) {
        this.idPortal = idPortal;
        this.urlPortal = urlPortal;
        this.estado = estado;
        this.usuariosActivos = usuariosActivos;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getIdPortal() {
        return idPortal;
    }

    public void setIdPortal(int idPortal) {
        this.idPortal = idPortal;
    }

    public String getUrlPortal() {
        return urlPortal;
    }

    public void setUrlPortal(String urlPortal) {
        this.urlPortal = urlPortal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getUsuariosActivos() {
        return usuariosActivos;
    }

    public void setUsuariosActivos(int usuariosActivos) {
        this.usuariosActivos = usuariosActivos;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public boolean autenticarUsuario() {
        return false;
    }

    public void mostrarDashboard() {
        System.out.println("Ejecutando mostrarDashboard");
    }

    public void registrarReclamoOnline() {
        System.out.println("Ejecutando registrarReclamoOnline");
    }
}
