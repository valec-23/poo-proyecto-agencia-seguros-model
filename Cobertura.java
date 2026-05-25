public class Cobertura {
    private int idCobertura;
    private String nombreCobertura;
    private String descripcion;
    private double montoMaximo;
    private double porcentajeCobertura;
    private boolean estado;
    private Poliza poliza;

    public Cobertura() {
    }

    public Cobertura(int idCobertura, String nombreCobertura, String descripcion, double montoMaximo, double porcentajeCobertura, boolean estado) {
        this.idCobertura = idCobertura;
        this.nombreCobertura = nombreCobertura;
        this.descripcion = descripcion;
        this.montoMaximo = montoMaximo;
        this.porcentajeCobertura = porcentajeCobertura;
        this.estado = estado;
    }

    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    public String getNombreCobertura() {
        return nombreCobertura;
    }

    public void setNombreCobertura(String nombreCobertura) {
        this.nombreCobertura = nombreCobertura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public double getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(double porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public double calcularIndemnizacion() {
        return 0.0;
    }

    public boolean validarCobertura() {
        return false;
    }

    public void actualizarCobertura() {
        System.out.println("Ejecutando actualizarCobertura");
    }
}
