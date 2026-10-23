public class Factura {
    private Libro libro;
    private int cantidad;
    private double tasaDescuento;
    private double tasaImpuesto;
    private double total;

    public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.tasaDescuento = tasaDescuento;
        this.tasaImpuesto = tasaImpuesto;
        this.total = this.calculaTotal();
    }

    public double calculaTotal() {
        double precioSubtotal = ((libro.getPrecio() - (libro.getPrecio() * tasaDescuento)) * this.cantidad);
        double precioConImpuestos = precioSubtotal * (1 + tasaImpuesto);
        return precioConImpuestos;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTasaDescuento() {
        return tasaDescuento;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public double getTotal() {
        return total;
    }
}