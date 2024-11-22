/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta01;

/**
 *
 * @author pablo
 */
public class App {
    public static void main(String[] args) {
        // Instancia del sistema de evaluación
        EvaluacionNumero evaluacion = new EvaluacionNumero();

        // Ejemplo: Agregar números
        evaluacion.agregarNumero(5);
        evaluacion.agregarNumero(-3);
        evaluacion.agregarNumero(2);
        evaluacion.agregarNumero(-8);
        evaluacion.agregarNumero(0);

        // Mostrar resultados
        System.out.println("Números ingresados: " + evaluacion.getCantidadNumeros());
        System.out.println("Promedio: " + evaluacion.calcularPromedio());
        System.out.println("Positivos: " + evaluacion.getPositivos());
        System.out.println("Negativos: " + evaluacion.getNegativos());
        System.out.println("Pares: " + evaluacion.getPares());
        System.out.println("Impares: " + evaluacion.getImpares());

        // Limpiar los datos
        evaluacion.limpiar();
        System.out.println("Datos limpiados. Números ingresados: " + evaluacion.getCantidadNumeros());
    }
}
