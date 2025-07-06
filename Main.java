/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geston_de_empleados;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        // Crear objeto de Persona
        PERSONA persona1 = new PERSONA("Ana", 30);
        persona1.mostrarInformacion();

        System.out.println("----------------------");

        // Crear objeto de Empleado (Herencia)
        Empleado empleado1 = new Empleado("Carlos", 35, 1200.50);
        empleado1.mostrarInformacion(); // Polimorfismo (método sobrescrito)

        System.out.println("----------------------");

        // Uso de Encapsulación: modificar atributos a través de métodos set
        empleado1.setSalario(1350.75);
        System.out.println("Nuevo salario de " + empleado1.getNombre() + ": $" + empleado1.getSalario());
    }
}

    

