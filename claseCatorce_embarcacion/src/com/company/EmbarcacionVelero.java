package com.company;

public class EmbarcacionVelero extends Embarcacion {
    private int cantidadMastiles;

    public EmbarcacionVelero(Capitan capitan, Double precioBase, Double valorAdicional, int anioFabricacion, Double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande(){
        if (cantidadMastiles > 4){
            return true;
        } else {
            return false;
        }
    }

}
