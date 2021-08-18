package com.company;

public class Agua extends Pokemon {
    private String tipoAtaque;

    public Agua (String nombre, double altura, int ataque, int defensa, String tipoAtaque)
    {
        super(nombre,altura,ataque,defensa);
        this.tipoAtaque = tipoAtaque;
    }
}
