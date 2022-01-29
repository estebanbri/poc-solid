package com.example.poc.D_Interface_Segregation.good.impl;

import com.example.poc.D_Interface_Segregation.good.IPrint;

public class SimplePrinter implements IPrint {

    @Override
    public void print() {
        System.out.println("Printing by Simple Printer ....");
    }

    // :D de esta manera no forzamos a SimplePrinter a implement los metodos que no usa.

}
