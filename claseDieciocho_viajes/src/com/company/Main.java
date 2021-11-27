package com.company;

public class Main {

    public static void main(String[] args) {

    Empresa empresa1 = new Empresa("empresa1");

    Reserva reserva1 = new Reserva("1", 2, "Buenos Aires", "Bragado");
    Reserva reserva2 = new Reserva("2", 1, "Bragado", "Buenos Aires");
    Reserva reserva3 = new Reserva("3", 3, "Luján", "Bragado");
    Reserva reserva4 = new Reserva("4", 1, "Mercedes", "Chivilcoy");
    Reserva reserva5 = new Reserva("5", 4, "Buenos Aires", "Alberti");
    Reserva reserva6 = new Reserva("6", 1, "Luján", "Suipacha");
    Reserva reserva7 = new Reserva("7", 2, "Mercedes", "Chivilcoy");

    empresa1.addReserva(reserva1);
    empresa1.addReserva(reserva2);
    empresa1.addReserva(reserva3);

    System.out.println(empresa1.recaudacionTotal());

        try {
            System.out.println("La estación de Bs.As. fue recorrida: " + empresa1.cantVecesRecorrida("Buenos Aire") + " veces");
        } catch (EmpresaException e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }

        try {
            System.out.println("La estación de Buenos Aires fue recorrida: " + empresa1.cantVecesRecorrida("Buenos Aires") + " veces");
        } catch (EmpresaException e) {
            System.err.println(e.getMessage());
        }


    }
}
