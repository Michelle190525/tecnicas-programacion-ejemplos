/**
 * Clase que representa una Persona con nombre y edad.
 */
public class Persona {
    private String nombre;
    private int edad;

    /**
     * Constructor por defecto.
     * Inicializa con valores predeterminados.
     */
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    /**
     * Constructor parametrizado.
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
