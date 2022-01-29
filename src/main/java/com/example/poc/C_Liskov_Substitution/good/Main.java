package com.example.poc.C_Liskov_Substitution.good;

import com.example.poc.C_Liskov_Substitution.good.impl.Avestruz;
import com.example.poc.C_Liskov_Substitution.good.impl.Paloma;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ave> aves = new ArrayList<>();
        Ave paloma = new Paloma();
        Ave avestruz = new Avestruz();
        aves.add(paloma);
        aves.add(avestruz);

        for (Ave ave : aves) {
            ave.comer();
        }

        List<AveVolador> avesVoladoras = new ArrayList<>();
        AveVolador paloma1 = new Paloma();
        AveVolador paloma2 = new Paloma();
        avesVoladoras.add(paloma1);
        avesVoladoras.add(paloma2);

        for (AveVolador aveVolador : avesVoladoras) {
            aveVolador.comer(); // comer Ya lo hereda de tipo Ave
            aveVolador.volar(); // volar es especifico de aves voladoras
        }


    }

}
