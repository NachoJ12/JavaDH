package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Dueño dueño1 = new Dueño("Jose", "Perez", "30-18697215-0");
        Dueño dueño2 = new Dueño("Pedro", "Fernandez", "30-16555888-5");
        Dueño dueño3 = new Dueño("Maria", "Gonzalez", "30-16547368-0");

        Campo campo1 = new Campo(dueño1, new Date(30-11-2021), 1550000.50, "Avenida Siempre Viva 742", true, true, 127.0);
        System.out.println("El campo es apto cultivo: " + campo1.aptoCultivo());
        System.out.println("El campo1 se puede vender: " + campo1.sePuedeVender());

        System.out.println("\n");

        Casa casa1 = new Casa(dueño2, new Date(30-11-2021), 21000.0,"Calle falsa 123", false, 4, 170.4);
        Casa casa2 = new Casa(dueño3,new Date(30-11-2021), 65852.70,"Calle falsa 745", false, 7, 347.4);

        System.out.println("La casa1 se puede vender: " + casa1.sePuedeVender());

        if(casa1.compareTo(casa2) > 0){
            System.out.println("La casa 1 tiene más ambientes que la casa 2");
        } else if(casa1.compareTo(casa2) < 0){
            System.out.println("La casa 2 tiene más ambientes que la casa 1");
        } else {
            System.out.println("La casa 1 tiene los mismos ambientes que la casa 2");
        }
        
    }
}
