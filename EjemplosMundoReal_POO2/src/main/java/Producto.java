public abstract class Producto implements Vendible {
    private final String nombre;
    private final String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Descripción: " + descripcion);
    }

    @Override
    public abstract double obtenerPrecio();
}
