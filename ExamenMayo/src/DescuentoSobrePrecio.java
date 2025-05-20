public class DescuentoSobrePrecio {

    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    public DescuentoSobrePrecio(String nombreProducto, double precioOriginal, double descuento) {
        this.nombreProducto = nombreProducto;
        this.precioOriginal = precioOriginal;
        this.descuento = descuento;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double precioFinalConDescuento(double precioOriginal, double descuento) {
        double precioFinal = precioOriginal - (precioOriginal * descuento/100);
        return precioFinal;
    }

    public void mostrarDetalles() {
        System.out.println("- Nombre Producto = " + nombreProducto + "\n - Precio Original = " + precioOriginal + "€"
                + "\n - Descuento = " + descuento + "%" + "\n - Precio Final = "
                + precioFinalConDescuento(precioOriginal, descuento) + "€");
    }

}
