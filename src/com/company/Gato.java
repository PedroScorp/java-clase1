package com.company;

public class Gato extends Animal {
    //ATRIBUTOS
    private String razaDeGato;
    private String dueño;
    private String color;

    //CONSTRUCTOR DEFECTO
    public Gato() {
        super();
    }

    //CONSTRUCTOR CON PARAMETROS
    public Gato(int edad,String nombre,double peso,boolean esMacho,char inicial,String razaDeGato, String dueño, String color) {
        super(edad,nombre,peso,esMacho,inicial);
        this.razaDeGato = razaDeGato;
        this.dueño = dueño;
        this.color = color;
    }

    //SETTERS
    public void setRazaDeGato(String razaDeGato)    {this.razaDeGato = razaDeGato;  }
    public void setDueño(String dueño)              {this.dueño = dueño;            }
    public void setColor(String color)              {this.color = color;            }

    //GETTERS
    public String getRazaDeGato()                   {return razaDeGato; }
    public String getDueño()                        {return dueño;      }
    public String getColor()                        {return color;      }

    //METODOS
    public void decirRaza() {
        System.out.println("La raza es: " + razaDeGato);
    }

    public void decirDueño() {
        System.out.println("El dueño es: " + dueño);
    }

    public void decirColor() {
        System.out.println("El color es: " + color);
    }
}
