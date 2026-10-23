public class App {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Clean Code", "Robert C. Martin", 2008, 120, "978-0132350884");
        
        Factura miFactura = new Factura(miLibro, 2, 0.10, 0.19);
        
        FacturaImpresora impresora = new FacturaImpresora();
        impresora.imprimeFactura(miFactura);
        
        System.out.println("----------------------------------------");
        
        FacturaRepositorio repositorio = new FacturaRepositorio();
        repositorio.guardarArchivo(miFactura, "factura_001");
    }
}