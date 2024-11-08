public class Venta {

    private int codigo;
    private Cliente cliente;
    private int cantidad;
    private Producto producto[10];
    private double total;
    private FormaPago pago;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public FormaPago getPago() {
        return pago;
    }
    public void setPago(FormaPago pago) {
        this.pago = pago;
    }
    
}
