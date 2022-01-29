package com.example.poc.E_Dependency_Inversion.good;

public class Piloto {

    private IAuto auto;


    public Piloto(IAuto auto) { // Inyectamos la dependencia auto en runtime puede ser cualquier clase que implemente la intetfaz Auto
        this.auto = auto;
    }
}
