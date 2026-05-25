import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EvaluacionMadurez {
    private int idEvaluacion;
    private LocalDate fechaEvaluacion;
    private double puntajeTotal;
    private String nivelMadurez;
    private String observaciones;
    private double porcentajeDigitalizacion;
    private int procesosAutomatizados;
    private List<RecomendacionDigital> recomendacionDigitalList = new ArrayList<>();

    public EvaluacionMadurez() {
    }

    public EvaluacionMadurez(int idEvaluacion, LocalDate fechaEvaluacion, double puntajeTotal, String nivelMadurez, String observaciones, double porcentajeDigitalizacion, int procesosAutomatizados) {
        this.idEvaluacion = idEvaluacion;
        this.fechaEvaluacion = fechaEvaluacion;
        this.puntajeTotal = puntajeTotal;
        this.nivelMadurez = nivelMadurez;
        this.observaciones = observaciones;
        this.porcentajeDigitalizacion = porcentajeDigitalizacion;
        this.procesosAutomatizados = procesosAutomatizados;
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public LocalDate getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(LocalDate fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public double getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(double puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public String getNivelMadurez() {
        return nivelMadurez;
    }

    public void setNivelMadurez(String nivelMadurez) {
        this.nivelMadurez = nivelMadurez;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPorcentajeDigitalizacion() {
        return porcentajeDigitalizacion;
    }

    public void setPorcentajeDigitalizacion(double porcentajeDigitalizacion) {
        this.porcentajeDigitalizacion = porcentajeDigitalizacion;
    }

    public int getProcesosAutomatizados() {
        return procesosAutomatizados;
    }

    public void setProcesosAutomatizados(int procesosAutomatizados) {
        this.procesosAutomatizados = procesosAutomatizados;
    }

    public List<RecomendacionDigital> getRecomendacionDigitalList() {
        return recomendacionDigitalList;
    }

    public void setRecomendacionDigitalList(List<RecomendacionDigital> recomendacionDigitalList) {
        this.recomendacionDigitalList = recomendacionDigitalList;
    }

    public double calcularMadurez() {
        return 0.0;
    }

    public String generarDiagnostico() {
        return "";
    }

    public void emitirRecomendaciones() {
        System.out.println("Ejecutando emitirRecomendaciones");
    }
}
