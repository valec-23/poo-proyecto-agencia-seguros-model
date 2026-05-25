import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int idSucursal;
    private String nombreSucursal;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String gerente;
    private boolean estado;
    private List<Empleado> empleadoList = new ArrayList<>();

    public Sucursal() {
    }

    public Sucursal(int idSucursal, String nombreSucursal, String direccion, String telefono, String ciudad, String gerente, boolean estado) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.gerente = gerente;
        this.estado = estado;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public void registrarSucursal() {
        System.out.println("Ejecutando registrarSucursal");
    }

    public void actualizarSucursal() {
        System.out.println("Ejecutando actualizarSucursal");
    }

    public String generarReporteSucursal() {
        return "";
    }
}
