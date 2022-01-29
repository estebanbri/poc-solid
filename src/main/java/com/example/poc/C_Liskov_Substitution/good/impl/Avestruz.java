package com.example.poc.C_Liskov_Substitution.good.impl;

import com.example.poc.C_Liskov_Substitution.good.AveVolador;

public class Avestruz implements AveVolador {

    @Override
    public void startPedal() {
        System.out.println("Starting Pedaleando...");
    }


}
