import java.time.LocalDate;

public class Documento {
    private int idDocumento;
    private String nombreArchivo;
    private String tipoDocumento;
    private LocalDate fechaCarga;
    private String rutaArchivo;
    private double tamanoArchivo;
    private String estadoValidacion;
    private Reclamo reclamo;
    private InspeccionAutomatizada inspeccionAutomatizada;

    public Documento() {
    }

    public Documento(int idDocumento, String nombreArchivo, String tipoDocumento, LocalDate fechaCarga, String rutaArchivo, double tamanoArchivo, String estadoValidacion) {
        this.idDocumento = idDocumento;
        this.nombreArchivo = nombreArchivo;
        this.tipoDocumento = tipoDocumento;
        this.fechaCarga = fechaCarga;
        this.rutaArchivo = rutaArchivo;
        this.tamanoArchivo = tamanoArchivo;
        this.estadoValidacion = estadoValidacion;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getEstadoValidacion() {
        return estadoValidacion;
    }

    public void setEstadoValidacion(String estadoValidacion) {
        this.estadoValidacion = estadoValidacion;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    public InspeccionAutomatizada getInspeccionAutomatizada() {
        return inspeccionAutomatizada;
    }

    public void setInspeccionAutomatizada(InspeccionAutomatizada inspeccionAutomatizada) {
        this.inspeccionAutomatizada = inspeccionAutomatizada;
    }

    public boolean validarDocumento() {
        return false;
    }

    public void subirDocumento() {
        System.out.println("Ejecutando subirDocumento");
    }

    public void eliminarDocumento() {
        System.out.println("Ejecutando eliminarDocumento");
    }
}
