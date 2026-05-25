import java.time.LocalDateTime;

public class BitacoraSistema {
    private int idBitacora;
    private LocalDateTime fechaRegistro;
    private String accion;
    private String modulo;
    private String usuarioResponsable;
    private String descripcion;
    private String ipAcceso;

    public BitacoraSistema() {
    }

    public BitacoraSistema(int idBitacora, LocalDateTime fechaRegistro, String accion, String modulo, String usuarioResponsable, String descripcion, String ipAcceso) {
        this.idBitacora = idBitacora;
        this.fechaRegistro = fechaRegistro;
        this.accion = accion;
        this.modulo = modulo;
        this.usuarioResponsable = usuarioResponsable;
        this.descripcion = descripcion;
        this.ipAcceso = ipAcceso;
    }

    public int getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(int idBitacora) {
        this.idBitacora = idBitacora;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(String usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIpAcceso() {
        return ipAcceso;
    }

    public void setIpAcceso(String ipAcceso) {
        this.ipAcceso = ipAcceso;
    }

    public void registrarEvento() {
        System.out.println("Ejecutando registrarEvento");
    }

    public String generarBitacora() {
        return "";
    }

    public void filtrarEventos() {
        System.out.println("Ejecutando filtrarEventos");
    }
}
