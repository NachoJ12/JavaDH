package com.company;

public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public void mostrar(){
        System.out.println("La energía es de: " + getEnergia());
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
