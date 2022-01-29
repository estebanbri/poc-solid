package com.example.poc.E_Dependency_Inversion.wrong;

public class Piloto {

    private AutoCarrera autoCarrera;

    public Piloto() {
        autoCarrera = new AutoCarrera(); // FIXME alto acoplamiento con una implementacion AutoCarrera. Crear una interfaz de Auto y pasarla por parametrro al constructor
    }

}
