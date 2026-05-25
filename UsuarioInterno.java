public class UsuarioInterno extends Usuario {
    private int idInterno;
    private String areaTrabajo;
    private String cargo;
    private String nivelAcceso;
    private String turnoLaboral;
    private boolean estadoEmpleado;

    public UsuarioInterno() {
    }

    public UsuarioInterno(int idInterno, String areaTrabajo, String cargo, String nivelAcceso, String turnoLaboral, boolean estadoEmpleado) {
        this.idInterno = idInterno;
        this.areaTrabajo = areaTrabajo;
        this.cargo = cargo;
        this.nivelAcceso = nivelAcceso;
        this.turnoLaboral = turnoLaboral;
        this.estadoEmpleado = estadoEmpleado;
    }

    public int getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(int idInterno) {
        this.idInterno = idInterno;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getTurnoLaboral() {
        return turnoLaboral;
    }

    public void setTurnoLaboral(String turnoLaboral) {
        this.turnoLaboral = turnoLaboral;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public void aprobarReclamo() {
        System.out.println("Ejecutando aprobarReclamo");
    }

    public void generarReporteInterno() {
        System.out.println("Ejecutando generarReporteInterno");
    }

    public void asignarPermisos() {
        System.out.println("Ejecutando asignarPermisos");
    }

    public boolean validarOperacion() {
        return false;
    }
}
