package org.example.ejercicio3;

public class CombinacionesDados {
    private static final int CARAS_DADO = 6;

    public static void generarCombinaciones(int numeroDados) {
        if (numeroDados <= 0) {
            System.out.println("El número de dados debe ser mayor que 0");
            return;
        }
        int[] combinacion = new int[numeroDados];
        generarCombinacionesRecursivo(combinacion, 0);
    }

    private static void generarCombinacionesRecursivo(int[] combinacion, int posicionActual) {
        // Caso base: hemos llenado todas las posiciones
        if (posicionActual == combinacion.length) {
            imprimirCombinacion(combinacion);
            return;
        }

        // Caso recursivo: probamos todos los valores posibles para la posición actual
        for (int i = 1; i <= CARAS_DADO; i++) {
            combinacion[posicionActual] = i;
            generarCombinacionesRecursivo(combinacion, posicionActual + 1);
        }
    }

    private static void imprimirCombinacion(int[] combinacion) {
        System.out.print("[ ");
        for (int valor : combinacion) {
            System.out.print(valor + " ");
        }
        System.out.println("]");
    }
}
