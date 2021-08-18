package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n=========EJERCICIO1=========");
        EJERCICIO1();
        System.out.println("\n=========EJERCICIO2=========");
        EJERCICIO2();
        System.out.println("\n=========EJERCICIO3=========");
        EJERCICIO3();

    }

    static void EJERCICIO1() {
        /*
        GATO1
        */
        Gato gato1 = new Gato ();

        gato1.setColor("VERDE");
        gato1.setDueño("JORGE");
        gato1.setEdad(13);
        gato1.setEsMacho(true);
        gato1.setInicial('M');
        gato1.setNombre("MICHI");
        gato1.setPeso(3);
        gato1.setRazaDeGato("MININO");

        System.out.println("Color: " + gato1.getColor());
        System.out.println("Dueño: " + gato1.getDueño());
        System.out.println("Edad: " + gato1.getEdad());
        System.out.println("Es Macho?: " + gato1.getEsMacho());
        System.out.println("Inicial: " + gato1.getInicial());
        System.out.println("Nombre: " + gato1.getNombre());
        System.out.println("Peso: " + gato1.getPeso());
        System.out.println("Raza: " + gato1.getRazaDeGato());
        /*
        GATO2
        */
        Gato gato2 = new Gato (2,"PEPE",2,false,'R',"MININO","DANIEL","ROJO");
        System.out.println();//espacio
        gato2.decirEdad();
        gato2.decirNombreEInicial();
        gato2.mostrarPeso();
        gato2.mostrarGénero();
        gato2.decirRaza();
        gato2.decirDueño();
        gato2.decirColor();
    }
    static void EJERCICIO2() {
        List <String> stringList = new ArrayList<>();
        stringList.add("Hola");
        stringList.add("soy");
        stringList.add("Juan");
        stringList.add("Perez");

        String concatenado="";
        for (String cadena: stringList ) {
            concatenado = concatenado + cadena;
        }
        System.out.println(concatenado);
    }
    static void EJERCICIO3() {
        double x = 30 , y = 10;
        System.out.println("La suma es: " + Calculadora.sumar2Numeros(x,y));
        System.out.println("La resta es: " + Calculadora.restar2Numeros(x,y));
        System.out.println("La multiplicación es: " + Calculadora.multiplica2Numeros(x,y));
        System.out.println("La división es: " + Calculadora.divide2Numeros(x,y));

        if (Calculadora.sonIguales(x,y))
        {   System.out.println("Los dos números son: iguales");
        }else{
            System.out.println("Los dos números son: diferentes");
        }
    }
}
