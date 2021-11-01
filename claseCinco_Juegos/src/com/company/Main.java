package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        UsuarioJuego juego1 = new UsuarioJuego("Nacho", "12345");

        //Inicialmente su nivel y puntaje esta en 0
        juego1.mostrarPuntaje();
        juego1.mostrarNivel();
        System.out.println("---------------");

        //Aumento 1 puntaje y 2 niveles
        juego1.aumentarPuntaje();
        juego1.subirNivel();
        juego1.subirNivel();
        juego1.mostrarPuntaje();
        juego1.mostrarNivel();
        System.out.println("---------------");

        //aumento el puntaje con un bonus
        juego1.bonus(20);
        juego1.mostrarPuntaje();
        System.out.println("---------------");
    }
}
