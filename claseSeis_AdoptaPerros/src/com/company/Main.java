package com.company;

// import java.time.*;
// import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Perro sasha = new Perro("Sasha", "Ovejero Velga", 2002, 15.0,true,false);
        Perro azul = new Perro("Azul", "Épagneul Bretón", 2018, 12.3,false,true);
        Perro otto = new Perro("Otto", "Golden", 2020, 15.0, true, false);
        Perro pepe = new Perro("Pepe", 7.5, true);

        sasha.edadPerro();
        sasha.sePuedePerder();
        System.out.println("En adopción: " + sasha.getEnAdopcion());
        sasha.enviarAdopcionPerro();
        System.out.println("En adopción: " + sasha.getEnAdopcion());
        System.out.println("---------------");

        azul.edadPerro();
        azul.sePuedePerder();
        System.out.println("En adopción: " + azul.getEnAdopcion());
        System.out.println("---------------");

        otto.edadPerro();
        otto.sePuedePerder();
        System.out.println("---------------");

        System.out.println(pepe.getLastimado());
    }
}
