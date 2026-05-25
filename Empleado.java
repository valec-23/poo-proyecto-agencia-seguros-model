import java.time.LocalDate;

public class Empleado {
    private String codigoEmpleado;
    private String cargo;
    private String departamento;
    private double salario;
    private LocalDate fechaContratacion;
    private String estadoLaboral;
    private Usuario usuario;
    private Sucursal sucursal;

    public Empleado() {
    }

    public Empleado(String codigoEmpleado, String cargo, String departamento, double salario, LocalDate fechaContratacion, String estadoLaboral) {
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.estadoLaboral = estadoLaboral;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public void registrarAsistencia() {
        System.out.println("Ejecutando registrarAsistencia");
    }

    public String generarReporteLaboral() {
        return "";
    }
}
