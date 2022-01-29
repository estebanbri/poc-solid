package com.example.poc.C_Liskov_Substitution.wrong.impl;

import com.example.poc.C_Liskov_Substitution.wrong.Ave;

public class Avestruz implements Ave {

    @Override
    public void comer() {
        System.out.println("Avestruz Comiendo");
    }

    @Override
    public void volar() {
        // FIXME CASO A:  Cuando un metodo heredo o implementado no es aplicable para una clase hija. Esto hace que esta clase hija no se pueda tratar como un padre (no es intercambiable)
        throw new UnsupportedOperationException("Los avestruz no vuelan");
    }
}
