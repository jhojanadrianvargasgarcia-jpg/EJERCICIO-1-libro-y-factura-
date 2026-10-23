public class Libro {
    private String nombre;
    private String nombreAutor;
    private int anyo;
    private int precio;
    private String isbn;

    public Libro(String nombre, String nombreAutor, int anyo, int precio, String isbn) {
        this.nombre = nombre;
        this.nombreAutor = nombreAutor;
        this.anyo = anyo;
        this.precio = precio;
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getIsbn() {
        return isbn;
    }
}