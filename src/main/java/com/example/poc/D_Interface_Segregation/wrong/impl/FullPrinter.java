package com.example.poc.D_Interface_Segregation.wrong.impl;

import com.example.poc.D_Interface_Segregation.wrong.IPrinterTasks;

public class FullPrinter implements IPrinterTasks {

    @Override
    public void print() {
        System.out.println("Printing by Full Printer ....");
    }

    @Override
    public void scan() {
        System.out.println("Scanning by Full Printer ....");
    }

    @Override
    public void fax() {
        System.out.println("Sending Fax by Full Printer ....");
    }

    @Override
    public void printDuplex() {
        System.out.println("Printing duplex by Full Printer ....");
    }

}
