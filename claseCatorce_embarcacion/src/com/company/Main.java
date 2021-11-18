package com.company;

public class Main {

    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Jack", "Sparrow", "IT57268");
        Capitan capitan2 = new Capitan("Héctor", "Barbossa", "IT38124");
        Capitan capitan3 = new Capitan("Davy", "Jones", "IT11475");

        EmbarcacionYate yate1 = new EmbarcacionYate(capitan1, 95000.00, 15000.0,1695, 50.40, 40);
        EmbarcacionYate yate2 = new EmbarcacionYate(capitan3, 110000.00, 12000.0,2020, 70.40, 53);
        EmbarcacionVelero velero1 = new EmbarcacionVelero(capitan2, 40000.50, 9557.40, 2021, 27.92, 2);

        System.out.println(yate1.calcularAlquiler());
        System.out.println(yate1.compareTo(yate2));

        System.out.println(velero1.esGrande());
        System.out.println(velero1.calcularAlquiler());

        yate2.capitanDeEmbarcacion();
    }
}
