/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta01;

/**
 *
 * @author pablo
 */
import java.util.ArrayList;
import java.util.List;

public class EvaluacionNumero {

    private List<Numero> numeros; // Lista de objetos `Numero`

    public EvaluacionNumero() {
        numeros = new ArrayList<>();
    }

    // Método para agregar un número
    public void agregarNumero(int valor) {
        Numero numero = new Numero(valor);
        numeros.add(numero);
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        if (numeros.isEmpty()) return 0;
        int suma = numeros.stream().mapToInt(Numero::getValor).sum();
        return (double) suma / numeros.size();
    }

    // Métodos para obtener listas clasificadas
    public List<Integer> getPositivos() {
        List<Integer> positivos = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.esPositivo()) {
                positivos.add(numero.getValor());
            }
        }
        return positivos;
    }

    public List<Integer> getNegativos() {
        List<Integer> negativos = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.esNegativo()) {
                negativos.add(numero.getValor());
            }
        }
        return negativos;
    }

    public List<Integer> getPares() {
        List<Integer> pares = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.esPar()) {
                pares.add(numero.getValor());
            }
        }
        return pares;
    }

    public List<Integer> getImpares() {
        List<Integer> impares = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.esImpar()) {
                impares.add(numero.getValor());
            }
        }
        return impares;
    }

    // Métodos para obtener la cantidad de números
    public int getCantidadNumeros() {
        return numeros.size();
    }

    public int getCantidadPositivos() {
        return getPositivos().size();
    }

    public int getCantidadNegativos() {
        return getNegativos().size();
    }

    public int getCantidadPares() {
        return getPares().size();
    }

    public int getCantidadImpares() {
        return getImpares().size();
    }

    // Método para limpiar datos
    public void limpiar() {
        numeros.clear();
    }
}
