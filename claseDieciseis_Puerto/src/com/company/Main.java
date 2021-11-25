package com.company;

public class Main {

    public static void main(String[] args) {

        Puerto puertoDeManzanillo = new Puerto("Puerto de Manzanillo");

        Contenedor contenedor1 = new Contenedor(1,true, "China");
        Contenedor contenedor3 = new Contenedor(3,false, "China");
        Contenedor contenedor8 = new Contenedor(8,false, "Canadá");
        Contenedor contenedor10 = new Contenedor(10,true, "Desconocida");

        puertoDeManzanillo.addContenedor(contenedor1);
        puertoDeManzanillo.addContenedor(contenedor3);
        puertoDeManzanillo.addContenedor(contenedor8);
        puertoDeManzanillo.addContenedor(contenedor10);


        Puerto puertoDeBuenosAires = new Puerto("Puerto de Buenos Aires");

        Contenedor contenedor2 = new Contenedor(2,false, "EEUU");
        Contenedor contenedor4 = new Contenedor(4,false, "Brasil");
        Contenedor contenedor5 = new Contenedor(5,true, "Rusia");
        Contenedor contenedor6 = new Contenedor(6,true, "Desconocida");
        Contenedor contenedor7 = new Contenedor(7,true, "Desconocida");
        Contenedor contenedor9 = new Contenedor(9,true, "China");
        Contenedor contenedor11 = new Contenedor(11,false, "Desconocida");

        puertoDeBuenosAires.addContenedor(contenedor4);
        puertoDeBuenosAires.addContenedor(contenedor2);
        puertoDeBuenosAires.addContenedor(contenedor6);
        puertoDeBuenosAires.addContenedor(contenedor5);
        puertoDeBuenosAires.addContenedor(contenedor9);
        puertoDeBuenosAires.addContenedor(contenedor7);
        puertoDeBuenosAires.addContenedor(contenedor11);

        puertoDeBuenosAires.mostrarContenedoresPorNumero();
        System.out.println("La cantidad de contenedores con materiales peligrosos es de: " + puertoDeBuenosAires.getCantidadContenedoresPeligrososProcedenciaDesconocida());

        contenedor11.setMaterialesPeligrosos(true);
        System.out.println("La cantidad de contenedores con materiales peligrosos es de: " + puertoDeBuenosAires.getCantidadContenedoresPeligrososProcedenciaDesconocida());

        System.out.println(contenedor11.toString());


    }
}


