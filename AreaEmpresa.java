import java.util.ArrayList;
import java.util.List;

public class AreaEmpresa {
    private int idArea;
    private String nombreArea;
    private String responsable;
    private int cantidadEmpleados;
    private String nivelDigitalizacion;
    private boolean estado;
    private String descripcion;
    private List<EvaluacionMadurez> evaluacionMadurezList = new ArrayList<>();

    public AreaEmpresa() {
    }

    public AreaEmpresa(int idArea, String nombreArea, String responsable, int cantidadEmpleados, String nivelDigitalizacion, boolean estado, String descripcion) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.responsable = responsable;
        this.cantidadEmpleados = cantidadEmpleados;
        this.nivelDigitalizacion = nivelDigitalizacion;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getNivelDigitalizacion() {
        return nivelDigitalizacion;
    }

    public void setNivelDigitalizacion(String nivelDigitalizacion) {
        this.nivelDigitalizacion = nivelDigitalizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<EvaluacionMadurez> getEvaluacionMadurezList() {
        return evaluacionMadurezList;
    }

    public void setEvaluacionMadurezList(List<EvaluacionMadurez> evaluacionMadurezList) {
        this.evaluacionMadurezList = evaluacionMadurezList;
    }

    public double calcularEficiencia() {
        return 0.0;
    }

    public void actualizarNivelDigital() {
        System.out.println("Ejecutando actualizarNivelDigital");
    }

    public String generarResumen() {
        return "";
    }
}
