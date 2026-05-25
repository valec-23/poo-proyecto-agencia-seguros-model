import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioCliente extends Usuario {
    private int idClienteWeb;
    private LocalDate fechaRegistro;
    private LocalDateTime ultimaConexion;
    private String dispositivoAcceso;
    private boolean estadoCuenta;
    private String nivelVerificacion;
    private ChatbotSoporte chatbotSoporte;
    private PortalAutogestion portalAutogestion;

    public UsuarioCliente() {
    }

    public UsuarioCliente(int idClienteWeb, LocalDate fechaRegistro, LocalDateTime ultimaConexion, String dispositivoAcceso, boolean estadoCuenta, String nivelVerificacion) {
        this.idClienteWeb = idClienteWeb;
        this.fechaRegistro = fechaRegistro;
        this.ultimaConexion = ultimaConexion;
        this.dispositivoAcceso = dispositivoAcceso;
        this.estadoCuenta = estadoCuenta;
        this.nivelVerificacion = nivelVerificacion;
    }

    public int getIdClienteWeb() {
        return idClienteWeb;
    }

    public void setIdClienteWeb(int idClienteWeb) {
        this.idClienteWeb = idClienteWeb;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(LocalDateTime ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public String getDispositivoAcceso() {
        return dispositivoAcceso;
    }

    public void setDispositivoAcceso(String dispositivoAcceso) {
        this.dispositivoAcceso = dispositivoAcceso;
    }

    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getNivelVerificacion() {
        return nivelVerificacion;
    }

    public void setNivelVerificacion(String nivelVerificacion) {
        this.nivelVerificacion = nivelVerificacion;
    }

    public ChatbotSoporte getChatbotSoporte() {
        return chatbotSoporte;
    }

    public void setChatbotSoporte(ChatbotSoporte chatbotSoporte) {
        this.chatbotSoporte = chatbotSoporte;
    }

    public PortalAutogestion getPortalAutogestion() {
        return portalAutogestion;
    }

    public void setPortalAutogestion(PortalAutogestion portalAutogestion) {
        this.portalAutogestion = portalAutogestion;
    }

    public void registrarReclamoOnline() {
        System.out.println("Ejecutando registrarReclamoOnline");
    }

    public void consultarPoliza() {
        System.out.println("Ejecutando consultarPoliza");
    }

    public void actualizarPerfil() {
        System.out.println("Ejecutando actualizarPerfil");
    }

    public boolean subirDocumentos() {
        return false;
    }
}
