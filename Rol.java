import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int idRol;
    private String nombreRol;
    private String descripcion;
    private int nivelAcceso;
    private boolean estado;
    private String attribute6;
    private List<Permiso> permisoList = new ArrayList<>();

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descripcion, int nivelAcceso, boolean estado, String attribute6) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.nivelAcceso = nivelAcceso;
        this.estado = estado;
        this.attribute6 = attribute6;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public List<Permiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<Permiso> permisoList) {
        this.permisoList = permisoList;
    }

    public void asignarPermisos() {
        System.out.println("Ejecutando asignarPermisos");
    }

    public boolean validarAcceso() {
        return false;
    }

    public String mostrarRol() {
        return "";
    }
}
