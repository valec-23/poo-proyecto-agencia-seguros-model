import java.time.LocalDate;

public class ContratoInteligente {
    private int idContrato;
    private String codigoContrato;
    private String estado;
    private LocalDate fechaEjecucion;
    private String condiciones;

    public ContratoInteligente() {
    }

    public ContratoInteligente(int idContrato, String codigoContrato, String estado, LocalDate fechaEjecucion, String condiciones) {
        this.idContrato = idContrato;
        this.codigoContrato = codigoContrato;
        this.estado = estado;
        this.fechaEjecucion = fechaEjecucion;
        this.condiciones = condiciones;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(LocalDate fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public void ejecutarPagoAutomatico() {
        System.out.println("Ejecutando ejecutarPagoAutomatico");
    }

    public boolean validarCondiciones() {
        return false;
    }

    public void generarLiquidacion() {
        System.out.println("Ejecutando generarLiquidacion");
    }
}
