import java.util.ArrayList;
import java.util.List;

public class NivelMadurez {
    private int idNivel;
    private String nombreNivel;
    private String descripcion;
    private double puntajeMinimo;
    private String port1;
    private double puntajeMaximo;
    private boolean estado;
    private List<EvaluacionMadurez> evaluacionMadurezList = new ArrayList<>();

    public NivelMadurez() {
    }

    public NivelMadurez(int idNivel, String nombreNivel, String descripcion, double puntajeMinimo, String port1, double puntajeMaximo, boolean estado) {
        this.idNivel = idNivel;
        this.nombreNivel = nombreNivel;
        this.descripcion = descripcion;
        this.puntajeMinimo = puntajeMinimo;
        this.port1 = port1;
        this.puntajeMaximo = puntajeMaximo;
        this.estado = estado;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(double puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public String getPort1() {
        return port1;
    }

    public void setPort1(String port1) {
        this.port1 = port1;
    }

    public double getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(double puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<EvaluacionMadurez> getEvaluacionMadurezList() {
        return evaluacionMadurezList;
    }

    public void setEvaluacionMadurezList(List<EvaluacionMadurez> evaluacionMadurezList) {
        this.evaluacionMadurezList = evaluacionMadurezList;
    }

    public String clasificarEmpresa() {
        return "";
    }

    public boolean validarNivel() {
        return false;
    }

    public void mostrarNivel() {
        System.out.println("Ejecutando mostrarNivel");
    }
}
