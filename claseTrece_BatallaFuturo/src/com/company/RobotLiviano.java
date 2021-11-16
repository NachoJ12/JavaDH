package com.company;

public class RobotLiviano extends SistemaArmas implements Atacar, Defender, Volar {

    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("ataco como Robot Liviano");
    }

    @Override
    public void defender() {
        System.out.println("defiendo como Robot Liviano");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como Robot Liviano");
    }
}
