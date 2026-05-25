public class ProcesoDigital {
    private int idProceso;
    private String nombreProceso;
    private String descripcion;
    private String nivelAutomatizacion;
    private double tiempoPromedio;
    private boolean estado;
    private String responsable;

    public ProcesoDigital() {
    }

    public ProcesoDigital(int idProceso, String nombreProceso, String descripcion, String nivelAutomatizacion, double tiempoPromedio, boolean estado, String responsable) {
        this.idProceso = idProceso;
        this.nombreProceso = nombreProceso;
        this.descripcion = descripcion;
        this.nivelAutomatizacion = nivelAutomatizacion;
        this.tiempoPromedio = tiempoPromedio;
        this.estado = estado;
        this.responsable = responsable;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelAutomatizacion() {
        return nivelAutomatizacion;
    }

    public void setNivelAutomatizacion(String nivelAutomatizacion) {
        this.nivelAutomatizacion = nivelAutomatizacion;
    }

    public double getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(double tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public double calcularEficiencia() {
        return 0.0;
    }

    public void automatizarProceso() {
        System.out.println("Ejecutando automatizarProceso");
    }

    public String generarReporte() {
        return "";
    }
}
