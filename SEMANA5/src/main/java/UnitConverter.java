/*
 * Programa: UnitConverter.java
 * Descripción: Este programa de consola ofrece un menú sencillo para:
 *   1) Convertir kilómetros a millas,
 *   2) Convertir grados Celsius a Fahrenheit,
 *   3) Calcular el área de un rectángulo.
 *
 * Demuestra el uso de diferentes tipos de datos:
 *   - int      
 *   - float    
 *   - String    
 *   - boolean   
 *
 * MICHELLE CASQUETE
 * Fecha: 28‑06‑2025
 */

import java.util.Scanner;

public class UnitConverter {
    // Constante para el factor de conversión km‑>mi
    private static final float KM_TO_MILES_FACTOR = 0.621371f;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean keep_running = true;
            
            while (keep_running) {
                print_menu();
                System.out.print("Selecciona una opción: ");
                int menu_option;
                
                // Validar que la entrada sea un entero
                if (scanner.hasNextInt()) {
                    menu_option = scanner.nextInt();
                } else {
                    System.out.println("Entrada no válida. Intenta nuevamente.\n");
                    scanner.nextLine(); // limpiar búfer
                    continue;
                }
                
                switch (menu_option) {
                    case 1 -> convert_km_to_miles(scanner);
                    case 2 -> convert_celsius_to_fahrenheit(scanner);
                    case 3 -> calculate_rectangle_area(scanner);
                    case 4 -> {
                        keep_running = false;
                        System.out.println("¡Hasta luego!");
                    }
                    default -> System.out.println("Opción fuera de rango.\n");
                }
                System.out.println(); // línea en blanco para separar iteraciones
            }
        }
    }

    // --- Funciones auxiliares (snake_case) ---

    /**
     * Imprime el menú principal.
     */
    private static void print_menu() {
        System.out.println("====== Menú Principal ======");
        System.out.println("1) Convertir kilómetros a millas");
        System.out.println("2) Convertir °C a °F");
        System.out.println("3) Calcular área de un rectángulo");
        System.out.println("4) Salir");
    }

    /**
     * solicit kilómetros y muestra su equivalente en millas.
     */
    private static void convert_km_to_miles(Scanner scanner) {
        System.out.print("Ingresa la distancia en kilómetros: ");
        float kilometers = scanner.nextFloat();
        float miles = kilometers * KM_TO_MILES_FACTOR;
        System.out.printf("%.2f km equivalen a %.2f millas.%n", kilometers, miles);
    }

    /**
     * Solicita grados Celsius y muestra su equivalente en Fahrenheit.
     */
    private static void convert_celsius_to_fahrenheit(Scanner scanner) {
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f °C equivalen a %.2f °F.%n", celsius, fahrenheit);
    }

    /**
     
     */
    private static void calculate_rectangle_area(Scanner scanner) {
        System.out.print("Ingresa el ancho: ");
        float width = scanner.nextFloat();
        System.out.print("Ingresa la altura: ");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.printf("El área del rectángulo es %.2f unidades cuadradas.%n", area);
    }
}
