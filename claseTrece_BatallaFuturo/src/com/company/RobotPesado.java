package com.company;

public class RobotPesado extends SistemaArmas implements Atacar, Defender, Volar {

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("ataco como Robot Pesado");
    }

    @Override
    public void defender() {
        System.out.println("defiendo como Robot Pesado");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como Robot Pesado");
    }
}