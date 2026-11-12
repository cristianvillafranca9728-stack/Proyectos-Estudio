
package com.ebac.modulo39;

public interface Transformer {

    void transformar();

    default void presentarse() {
        System.out.println("Soy un Transformer");
    }
}
