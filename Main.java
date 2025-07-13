/**
 * Clase principal para probar los constructores.
 */
public class Main {
    public static void main(String[] args) {
        // Usando constructor por defecto
        Persona persona1 = new Persona();
        persona1.mostrarInformacion();

        // Usando constructor parametrizado
        Persona persona2 = new Persona("Ana", 30);
        persona2.mostrarInformacion();

        // Estudiante con constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarInformacion();

        // Estudiante con constructor parametrizado (sobrecarga)
        Estudiante estudiante2 = new Estudiante("Carlos", 22, "Ingeniería");
        estudiante2.mostrarInformacion();
    }
}

