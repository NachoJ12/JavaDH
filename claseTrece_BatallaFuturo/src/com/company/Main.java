package com.company;

public class Main {

    public static void main(String[] args) {
	    RobotLiviano robot1 = new RobotLiviano(100);
        robot1.mostrar();

        RobotPesado robot2 = new RobotPesado(200);
        robot2.volar();

        Tanque tanque1 = new Tanque(400);
        tanque1.defender();

        Seniuelo seniuelo1 = new Seniuelo(70);
        seniuelo1.mostrar();


    }
}
