
package com.ebac.modulo39;

public abstract class Juguete {

    // Método abstracto: cada juguete tiene su propia habilidad
    public abstract void activarHabilidad();

    // Método con implementación
    public void presentarJuguete() {
        System.out.println("Activando figura de acción...");
    }
}
