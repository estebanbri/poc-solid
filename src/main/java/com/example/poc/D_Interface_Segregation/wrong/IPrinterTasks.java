package com.example.poc.D_Interface_Segregation.wrong;

// Es facil de identificar este principio con interfaces (o clases abstractas) gigantes, y haciendo que cada cliente se vea forzado a implementarla
// aunque no la use
public interface IPrinterTasks {
    void print();
    void scan();
    void fax();
    void printDuplex();
}
