/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta01;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public boolean esPositivo() {
        return valor > 0;
    }

    public boolean esNegativo() {
        return valor < 0;
    }

    public boolean esPar() {
        return valor % 2 == 0;
    }

    public boolean esImpar() {
        return !esPar();
    }
}
