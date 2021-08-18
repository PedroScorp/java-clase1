package com.company;

public class Pokemon {
    //atributos
    private String nombre;
    private double altura;
    private int ataque;
    private int defensa;

    // constructor
    public Pokemon (){

    }
    public Pokemon (String nombre, double altura, int ataque, int defensa)
    {
        this.nombre = nombre;
        this.altura  = altura;
        this.ataque  = ataque;
        this.defensa = defensa;
    }

    //metodos
    public void nombre () {
        System.out.println("Nombre de Pokemon: " + nombre + ", con altura: " + altura);
    }
    public void atacar () {
        System.out.println("Ataqueeeee con daño: " + ataque);
    }
    public void defender () {
        System.out.println("Defendiendo con defensa: " + defensa);
    }

}
