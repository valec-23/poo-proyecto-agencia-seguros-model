import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int idFactura;
    private String numeroFactura;
    private LocalDate fechaEmision;
    private double subtotal;
    private double iva;
    private double total;
    private String estadoPago;
    private PagoPrima pagoPrima;
    private List<Transaccion> transaccionList = new ArrayList<>();

    public Factura() {
    }

    public Factura(int idFactura, String numeroFactura, LocalDate fechaEmision, double subtotal, double iva, double total, String estadoPago) {
        this.idFactura = idFactura;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.estadoPago = estadoPago;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public PagoPrima getPagoPrima() {
        return pagoPrima;
    }

    public void setPagoPrima(PagoPrima pagoPrima) {
        this.pagoPrima = pagoPrima;
    }

    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    public double calcularTotal() {
        return 0.0;
    }

    public void generarFactura() {
        System.out.println("Ejecutando generarFactura");
    }

    public boolean validarFactura() {
        return false;
    }
}
