package com.company;

public class Main {

    public static void main(String[] args) {

        Circulo rueda = new Circulo("rueda", 1.0);
        Rectangulo contenedorVagon = new Rectangulo("contenedor del vagon", 5.0, 4.0);
        Rectangulo baseLocomotora = new Rectangulo("Base de locomotora", 3.0, 4.0);
        Rectangulo cabinaLocomotora = new Rectangulo("Cabina Locomotora", 1.5, 3.0);
        Rectangulo chimeneaLocomotora = new Rectangulo("Chimenea locomotora", 1.5, 1.0);
        Triangulo frenteLocomotora = new Triangulo("Frente locomotora", 2.0,2.0);

        FiguraCompleja vagon = new FiguraCompleja();
        vagon.addArmables(rueda);
        vagon.addArmables(rueda);
        vagon.addArmables(rueda);
        vagon.addArmables(contenedorVagon);


        FiguraCompleja locomotora = new FiguraCompleja();
        locomotora.addArmables(rueda);
        locomotora.addArmables(rueda);
        locomotora.addArmables(baseLocomotora);
        locomotora.addArmables(cabinaLocomotora);
        locomotora.addArmables(chimeneaLocomotora);
        locomotora.addArmables(frenteLocomotora);

        Tren tren1 = new Tren ("Tren de la locura");
        tren1.addTren(locomotora);
        tren1.addTren(vagon);
        tren1.addTren(vagon);
        tren1.addTren(vagon);
        tren1.addTren(vagon);

        System.out.println("El área del vagon es de: " + vagon.calcularArea());
        System.out.println("El área de la locomotora es de: " + locomotora.calcularArea());
        System.out.println("El área del tren es de: " + tren1.calcularAreaTren());







    }
}
