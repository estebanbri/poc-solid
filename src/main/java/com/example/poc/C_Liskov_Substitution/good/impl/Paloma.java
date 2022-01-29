package com.example.poc.C_Liskov_Substitution.good.impl;

import com.example.poc.C_Liskov_Substitution.good.AveVolador;

public class Paloma implements AveVolador {

    @Override
    public void comer() {
        System.out.println("Paloma Comiendo");
    }

    @Override
    public void volar() {
        System.out.println("Paloma Volando");
    }
}
