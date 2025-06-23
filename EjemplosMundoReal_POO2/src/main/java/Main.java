public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Libro sobre la amistad", "Antoine de Saint-Exupéry", 10.99);
        Libro libro2 = new Libro("1984", "Novela de distopía", "George Orwell", 8.50);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
