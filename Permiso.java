public class Permiso {
    private int idPermiso;
    private String nombrePermiso;
    private String descripcion;
    private String modulo;
    private boolean estado;

    public Permiso() {
    }

    public Permiso(int idPermiso, String nombrePermiso, String descripcion, String modulo, boolean estado) {
        this.idPermiso = idPermiso;
        this.nombrePermiso = nombrePermiso;
        this.descripcion = descripcion;
        this.modulo = modulo;
        this.estado = estado;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void activarPermiso() {
        System.out.println("Ejecutando activarPermiso");
    }

    public void desactivarPermiso() {
        System.out.println("Ejecutando desactivarPermiso");
    }

    public boolean validarPermiso() {
        return false;
    }
}
