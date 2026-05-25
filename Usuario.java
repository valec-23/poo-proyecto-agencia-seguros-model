import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String username;
    private String password;
    private String correo;
    private boolean estado;
    private LocalDate fechaCreacion;
    private LocalDateTime ultimoAcceso;
    private Rol rol;
    private List<BitacoraSistema> bitacoraSistemaList = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, String correo, boolean estado, LocalDate fechaCreacion, LocalDateTime ultimoAcceso) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.ultimoAcceso = ultimoAcceso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(LocalDateTime ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<BitacoraSistema> getBitacoraSistemaList() {
        return bitacoraSistemaList;
    }

    public void setBitacoraSistemaList(List<BitacoraSistema> bitacoraSistemaList) {
        this.bitacoraSistemaList = bitacoraSistemaList;
    }

    public boolean iniciarSesion() {
        return false;
    }

    public void cerrarSesion() {
        System.out.println("Ejecutando cerrarSesion");
    }

    public void recuperarContrasena() {
        System.out.println("Ejecutando recuperarContrasena");
    }
}
