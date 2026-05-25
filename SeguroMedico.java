public class SeguroMedico extends Seguro {
    private int idMedico;
    private String tipoCoberturaMedica;
    private String redHospitalaria;
    private double montoCobertura;
    private String enfermedadesPreexistentes;
    private String nivelPlan;

    public SeguroMedico() {
    }

    public SeguroMedico(int idMedico, String tipoCoberturaMedica, String redHospitalaria, double montoCobertura, String enfermedadesPreexistentes, String nivelPlan) {
        this.idMedico = idMedico;
        this.tipoCoberturaMedica = tipoCoberturaMedica;
        this.redHospitalaria = redHospitalaria;
        this.montoCobertura = montoCobertura;
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
        this.nivelPlan = nivelPlan;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getTipoCoberturaMedica() {
        return tipoCoberturaMedica;
    }

    public void setTipoCoberturaMedica(String tipoCoberturaMedica) {
        this.tipoCoberturaMedica = tipoCoberturaMedica;
    }

    public String getRedHospitalaria() {
        return redHospitalaria;
    }

    public void setRedHospitalaria(String redHospitalaria) {
        this.redHospitalaria = redHospitalaria;
    }

    public double getMontoCobertura() {
        return montoCobertura;
    }

    public void setMontoCobertura(double montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

    public String getEnfermedadesPreexistentes() {
        return enfermedadesPreexistentes;
    }

    public void setEnfermedadesPreexistentes(String enfermedadesPreexistentes) {
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
    }

    public String getNivelPlan() {
        return nivelPlan;
    }

    public void setNivelPlan(String nivelPlan) {
        this.nivelPlan = nivelPlan;
    }

    public double calcularPrimaMedica() {
        return 0.0;
    }

    public boolean validarCoberturaMedica() {
        return false;
    }

    public boolean autorizarConsulta() {
        return false;
    }

    public void generarHistorialMedico() {
        System.out.println("Ejecutando generarHistorialMedico");
    }
}
