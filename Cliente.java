import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigoCliente;
    private String tipoCliente;
    private LocalDate fechaRegistro;
    private int historialReclamos;
    private String nivelRiesgo;
    private double scoreFinanciero;
    private List<Poliza> polizaList = new ArrayList<>();
    private HistorialPago historialPago;
    private Agente agente;
    private ChatbotSoporte chatbotSoporte;

    public Cliente() {
    }

    public Cliente(String codigoCliente, String tipoCliente, LocalDate fechaRegistro, int historialReclamos, String nivelRiesgo, double scoreFinanciero) {
        this.codigoCliente = codigoCliente;
        this.tipoCliente = tipoCliente;
        this.fechaRegistro = fechaRegistro;
        this.historialReclamos = historialReclamos;
        this.nivelRiesgo = nivelRiesgo;
        this.scoreFinanciero = scoreFinanciero;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getHistorialReclamos() {
        return historialReclamos;
    }

    public void setHistorialReclamos(int historialReclamos) {
        this.historialReclamos = historialReclamos;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public double getScoreFinanciero() {
        return scoreFinanciero;
    }

    public void setScoreFinanciero(double scoreFinanciero) {
        this.scoreFinanciero = scoreFinanciero;
    }

    public List<Poliza> getPolizaList() {
        return polizaList;
    }

    public void setPolizaList(List<Poliza> polizaList) {
        this.polizaList = polizaList;
    }

    public HistorialPago getHistorialPago() {
        return historialPago;
    }

    public void setHistorialPago(HistorialPago historialPago) {
        this.historialPago = historialPago;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public ChatbotSoporte getChatbotSoporte() {
        return chatbotSoporte;
    }

    public void setChatbotSoporte(ChatbotSoporte chatbotSoporte) {
        this.chatbotSoporte = chatbotSoporte;
    }

    public void registrarReclamo() {
        System.out.println("Ejecutando registrarReclamo");
    }

    public String calcularNivelRiesgo() {
        return "";
    }

    public void actualizarPerfil() {
        System.out.println("Ejecutando actualizarPerfil");
    }
}
