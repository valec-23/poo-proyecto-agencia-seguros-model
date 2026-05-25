public class MetodoPago {
    private int idMetodoPago;
    private String tipoMetodo;
    private String entidadBancaria;
    private String numeroReferencia;
    private boolean estado;
    private double comisionBancaria;

    public MetodoPago() {
    }

    public MetodoPago(int idMetodoPago, String tipoMetodo, String entidadBancaria, String numeroReferencia, boolean estado, double comisionBancaria) {
        this.idMetodoPago = idMetodoPago;
        this.tipoMetodo = tipoMetodo;
        this.entidadBancaria = entidadBancaria;
        this.numeroReferencia = numeroReferencia;
        this.estado = estado;
        this.comisionBancaria = comisionBancaria;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getComisionBancaria() {
        return comisionBancaria;
    }

    public void setComisionBancaria(double comisionBancaria) {
        this.comisionBancaria = comisionBancaria;
    }

    public boolean validarMetodo() {
        return false;
    }

    public void procesarPago() {
        System.out.println("Ejecutando procesarPago");
    }

    public double calcularComision() {
        return 0.0;
    }
}
