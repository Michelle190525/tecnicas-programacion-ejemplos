public class Libro extends Producto {
    private String autor;
    private double precio;

    public Libro(String nombre, String descripcion, String autor, double precio) {
        super(nombre, descripcion);
        this.autor = autor;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Autor: " + autor + ", Precio: $" + precio);
    }
}
