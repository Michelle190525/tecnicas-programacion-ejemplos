/**
 * Clase que representa un Estudiante, que hereda de Persona.
 * Demuestra sobrecarga de constructores.
 */
public class Estudiante extends Persona {
    private String carrera;

    /**
     * Constructor por defecto.
     */
    public Estudiante() {
        super(); // Llama al constructor por defecto de Persona
        this.carrera = "Sin carrera";
    }

    /**
     * Constructor parametrizado.
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     * @param carrera Carrera que estudia.
     */
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llama al constructor de Persona con parámetros
        this.carrera = carrera;
    }

    // Getter y setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
    }
}
