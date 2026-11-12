
package com.ebac.modulo39;

public class MetodosEstaticos {

    // Método void
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Método int
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método String
    public static String obtenerMensaje(String nombre) {
        return "Bienvenido, " + nombre;
    }

    // Método boolean
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {

        MetodosEstaticos.saludar("Carlos");

        System.out.println("Multiplicación: "
                + MetodosEstaticos.multiplicar(4, 5));

        System.out.println(
                MetodosEstaticos.obtenerMensaje("Carlos"));

        System.out.println("¿Es positivo?: "
                + MetodosEstaticos.esPositivo(10));
    }
}
