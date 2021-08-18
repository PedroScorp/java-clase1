package com.company;

public class Animal {
     //ATRIBUTOS
    private int edad;
    private String nombre;
    private double peso;
    private boolean esMacho;
    private char inicial;

    //CONSTRUCTOR POR DEFECTO
    public Animal() {
        //no instance
    }

    //CONSTRUCTOR PARA ASIGNAR VALORES
    public Animal(int edad,String nombre,double peso,boolean esMacho,char inicial) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.esMacho = esMacho;
        this.inicial = inicial;
    }
    // SETTERS DE ATRIBUTOS
    public void setEdad(int edad)           {this.edad = edad;      }
    public void setNombre(String nombre)    {this.nombre = nombre;  }
    public void setPeso(double peso)        {this.peso = peso;      }
    public void setEsMacho(boolean esMacho) {this.esMacho = esMacho;}
    public void setInicial(char inicial)    {this.inicial = inicial;}

    //GETTERS DE ATRIBUTOS
    public int getEdad()        {return edad;    }
    public String getNombre()   {return nombre;  }
    public double getPeso()     {return peso;    }
    public boolean getEsMacho()  {return esMacho; }
    public char getInicial()    {return inicial; }

    public void decirEdad() {
        System.out.println("La edad del animal es: " + edad);
    }

    public void decirNombreEInicial() {
        System.out.println("El nombre es: " + nombre + ", y la inicial es: " + inicial);
    }

    public void mostrarPeso() {
        System.out.println("El peso del animal es: " + peso);
    }

    public void mostrarGénero() {
        if (esMacho) {
            System.out.println("El género del animal es: Macho");
        }else {
            System.out.println("El género del animal es: Hembra");
        }
    }
}
