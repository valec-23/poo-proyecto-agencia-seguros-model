import java.time.LocalDate;

public class IndicadorDashboard {
    private int idIndicador;
    private String nombreIndicador;
    private String descripcion;
    private double valorActual;
    private double meta;
    private String categoria;
    private LocalDate fechaActualizacion;
    private AnalisisFinanciero analisisFinanciero;

    public IndicadorDashboard() {
    }

    public IndicadorDashboard(int idIndicador, String nombreIndicador, String descripcion, double valorActual, double meta, String categoria, LocalDate fechaActualizacion) {
        this.idIndicador = idIndicador;
        this.nombreIndicador = nombreIndicador;
        this.descripcion = descripcion;
        this.valorActual = valorActual;
        this.meta = meta;
        this.categoria = categoria;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getNombreIndicador() {
        return nombreIndicador;
    }

    public void setNombreIndicador(String nombreIndicador) {
        this.nombreIndicador = nombreIndicador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public AnalisisFinanciero getAnalisisFinanciero() {
        return analisisFinanciero;
    }

    public void setAnalisisFinanciero(AnalisisFinanciero analisisFinanciero) {
        this.analisisFinanciero = analisisFinanciero;
    }

    public double calcularCumplimiento() {
        return 0.0;
    }

    public void actualizarIndicador() {
        System.out.println("Ejecutando actualizarIndicador");
    }

    public void generarGrafico() {
        System.out.println("Ejecutando generarGrafico");
    }
}
