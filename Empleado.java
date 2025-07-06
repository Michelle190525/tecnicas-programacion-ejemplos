/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geston_de_empleados;

/**
 *
 * @author USUARIO
 */
public class Empleado extends PERSONA {
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad); // Llamada al constructor de la clase base
        this.salario = salario;
    }

    // Getter y Setter (Encapsulación)
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Polimorfismo mediante sobrescritura del método
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama a la versión base
        System.out.println("Salario: $" + salario);
    }
}

    

