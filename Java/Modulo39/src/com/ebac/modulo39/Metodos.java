
package com.ebac.modulo39;

public class Metodos {

    // Método void: no devuelve ningún valor
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Método int: devuelve un número entero
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método String: devuelve texto
    public String obtenerMensaje(String nombre) {
        return "Bienvenido, " + nombre;
    }

    // Método boolean: devuelve verdadero o falso
    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {

        // Crear instancia de la clase
        Metodos objeto = new Metodos();

        objeto.saludar("Carlos");

        System.out.println("Suma: " + objeto.sumar(5, 3));

        System.out.println(objeto.obtenerMensaje("Carlos"));

        System.out.println("¿Es mayor de edad?: "
                + objeto.esMayorDeEdad(20));
    }
}
