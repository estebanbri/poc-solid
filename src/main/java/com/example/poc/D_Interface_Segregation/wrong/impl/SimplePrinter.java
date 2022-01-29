package com.example.poc.D_Interface_Segregation.wrong.impl;

import com.example.poc.D_Interface_Segregation.wrong.IPrinterTasks;

public class SimplePrinter implements IPrinterTasks {

    @Override
    public void print() {
        System.out.println("Printing by Simple Printer ....");
    }

    @Override
    public void scan() {
        // FIXME estamos obligando al client de la interface a darle implementacion aun si no la necesitan y obligarlos a lanzar una excepcion o no dejarlos sin implementacion
        throw new UnsupportedOperationException("It can not make scan");
    }

    @Override
    public void fax() {
        // FIXME estamos obligando al client de la interface a darle implementacion aun si no la necesitan y obligarlos a lanzar una excepcion o no dejarlos sin implementacion
        throw new UnsupportedOperationException("It can not make fax");
    }

    @Override
    public void printDuplex() {
        // FIXME estamos obligando al client de la interface a darle implementacion aun si no la necesitan y obligarlos a lanzar una excepcion o no dejarlos sin implementacion
        throw new UnsupportedOperationException("It can not print duplex");
    }
}
