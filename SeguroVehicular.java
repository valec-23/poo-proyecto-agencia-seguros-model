public class SeguroVehicular extends Seguro {
    private int idVehicular;
    private String tipoVehiculo;
    private String placa;
    private String modeloVehiculo;
    private int anioVehiculo;
    private double valorVehiculo;
    private double kilometraje;

    public SeguroVehicular() {
    }

    public SeguroVehicular(int idVehicular, String tipoVehiculo, String placa, String modeloVehiculo, int anioVehiculo, double valorVehiculo, double kilometraje) {
        this.idVehicular = idVehicular;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.modeloVehiculo = modeloVehiculo;
        this.anioVehiculo = anioVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.kilometraje = kilometraje;
    }

    public int getIdVehicular() {
        return idVehicular;
    }

    public void setIdVehicular(int idVehicular) {
        this.idVehicular = idVehicular;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setAnioVehiculo(int anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double calcularPrimaVehicular() {
        return 0.0;
    }

    public boolean validarCoberturaAccidente() {
        return false;
    }

    public double calcularDepreciacion() {
        return 0.0;
    }

    public void generarPolizaVehicular() {
        System.out.println("Ejecutando generarPolizaVehicular");
    }
}
