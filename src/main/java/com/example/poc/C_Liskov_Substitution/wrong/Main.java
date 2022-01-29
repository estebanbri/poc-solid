package com.example.poc.C_Liskov_Substitution.wrong;

import com.example.poc.C_Liskov_Substitution.wrong.impl.Paloma;
import com.example.poc.C_Liskov_Substitution.wrong.impl.Avestruz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ave> aves = new ArrayList<>();
        Ave avestruz = new Avestruz();
        Ave paloma = new Paloma();

        aves.add(avestruz);
        aves.add(paloma);

        for (Ave ave : aves) {
            ave.comer();
            if(ave instanceof Avestruz) return; // Esto es un indicio que Avestruz no es intercambiable por el tipo padre porque no puede volar
            ave.volar();
        }
    }
}
