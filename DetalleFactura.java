public class DetalleFactura {
    private int idDetalle;
    private String concepto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private Factura factura;

    public DetalleFactura() {
    }

    public DetalleFactura(int idDetalle, String concepto, int cantidad, double precioUnitario, double subtotal) {
        this.idDetalle = idDetalle;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public double calcularSubtotal() {
        return 0.0;
    }

    public void actualizarCantidad() {
        System.out.println("Ejecutando actualizarCantidad");
    }
}
