package com.example.poc.C_Liskov_Substitution.wrong.impl;

import com.example.poc.C_Liskov_Substitution.wrong.Ave;

// Podemos ver que hay varios casos que pueden llegar a rompen LSP
public class Paloma implements Ave {

    @Override
    public void comer() {
        System.out.println("Paloma Comiendo");
    }

    @Override
    public void volar() {
        System.out.println("Paloma Volando");
    }
}
