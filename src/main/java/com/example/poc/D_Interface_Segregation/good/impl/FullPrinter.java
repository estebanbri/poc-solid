package com.example.poc.D_Interface_Segregation.good.impl;

import com.example.poc.D_Interface_Segregation.good.IFax;
import com.example.poc.D_Interface_Segregation.good.IPrint;
import com.example.poc.D_Interface_Segregation.good.IPrintDuplex;
import com.example.poc.D_Interface_Segregation.good.IScan;

public class FullPrinter implements IPrint, IScan, IFax, IPrintDuplex {

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
