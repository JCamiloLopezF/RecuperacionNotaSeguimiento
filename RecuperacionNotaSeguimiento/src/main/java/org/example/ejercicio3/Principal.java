package org.example.ejercicio3;

public class Principal {
    public static void main(String[] args) {
        int numeroDados = 3;
        System.out.println("Generando todas las combinaciones posibles para " + numeroDados + " dados:");
        CombinacionesDados.generarCombinaciones(numeroDados);
    }
}
