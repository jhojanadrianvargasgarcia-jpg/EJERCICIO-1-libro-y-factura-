public class FacturaImpresora {

    public void imprimeFactura(Factura factura) {
        System.out.println("--- DETALLE DE LA FACTURA ---");
        System.out.println("Libro: " + factura.getLibro().getNombre());
        System.out.println("Autor: " + factura.getLibro().getNombreAutor());
        System.out.println("Año: " + factura.getLibro().getAnyo());
        System.out.println("ISBN: " + factura.getLibro().getIsbn());
        System.out.println("Precio Unitario: " + factura.getLibro().getPrecio() + "$");
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Tasa de Descuento: " + factura.getTasaDescuento());
        System.out.println("Tasa de Impuesto: " + factura.getTasaImpuesto());
        System.out.printf("Total a Pagar: %.2f$\n", factura.getTotal());
    }
}