package com.company;

public class Tanque extends SistemaArmas implements Atacar, Defender {

    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("ataco como un Tanque");
    }

    @Override
    public void defender() {
        System.out.println("defiendo como un Tanque");
    }
}
