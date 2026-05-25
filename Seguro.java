import java.util.ArrayList;
import java.util.List;

public class Seguro {
    private int idSeguro;
    private String nombreSeguro;
    private String tipoSeguro;
    private String descripcion;
    private double coberturaMaxima;
    private double costoBase;
    private String nivelRiesgo;
    private boolean estado;
    private String attribute1;
    private List<Poliza> polizaList = new ArrayList<>();
    private List<Cobertura> coberturaList = new ArrayList<>();

    public Seguro() {
    }

    public Seguro(int idSeguro, String nombreSeguro, String tipoSeguro, String descripcion, double coberturaMaxima, double costoBase, String nivelRiesgo, boolean estado, String attribute1) {
        this.idSeguro = idSeguro;
        this.nombreSeguro = nombreSeguro;
        this.tipoSeguro = tipoSeguro;
        this.descripcion = descripcion;
        this.coberturaMaxima = coberturaMaxima;
        this.costoBase = costoBase;
        this.nivelRiesgo = nivelRiesgo;
        this.estado = estado;
        this.attribute1 = attribute1;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCoberturaMaxima() {
        return coberturaMaxima;
    }

    public void setCoberturaMaxima(double coberturaMaxima) {
        this.coberturaMaxima = coberturaMaxima;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public List<Poliza> getPolizaList() {
        return polizaList;
    }

    public void setPolizaList(List<Poliza> polizaList) {
        this.polizaList = polizaList;
    }

    public List<Cobertura> getCoberturaList() {
        return coberturaList;
    }

    public void setCoberturaList(List<Cobertura> coberturaList) {
        this.coberturaList = coberturaList;
    }

    public double calcularCosto() {
        return 0.0;
    }

    public void activarSeguro() {
        System.out.println("Ejecutando activarSeguro");
    }

    public String obtenerCobertura() {
        return "";
    }
}
