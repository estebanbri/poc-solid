package com.example.poc.e_IDP.good;

public class Piloto {

    private IAuto auto;


    public Piloto(IAuto auto) { // Inyectamos la dependencia auto en runtime puede ser cualquier clase que implemente la intetfaz Auto
        this.auto = auto;
    }
}
