import java.util.ArrayList;
import java.util.List;

public class Agente extends Persona {
    private String codigoAgente;
    private double comision;
    private String sucursal;
    private String especialidad;
    private int ventasRealizadas;
    private String estadoLaboral;
    private List<Poliza> polizaList = new ArrayList<>();
    private Persona persona;

    public Agente() {
    }

    public Agente(String codigoAgente, double comision, String sucursal, String especialidad, int ventasRealizadas, String estadoLaboral) {
        this.codigoAgente = codigoAgente;
        this.comision = comision;
        this.sucursal = sucursal;
        this.especialidad = especialidad;
        this.ventasRealizadas = ventasRealizadas;
        this.estadoLaboral = estadoLaboral;
    }

    public String getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public List<Poliza> getPolizaList() {
        return polizaList;
    }

    public void setPolizaList(List<Poliza> polizaList) {
        this.polizaList = polizaList;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double calcularComision() {
        return 0.0;
    }

    public void generarReporteVentas() {
        System.out.println("Ejecutando generarReporteVentas");
    }

    public void registrarPoliza() {
        System.out.println("Ejecutando registrarPoliza");
    }
}
