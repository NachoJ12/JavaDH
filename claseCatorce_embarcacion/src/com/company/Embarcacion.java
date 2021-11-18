package com.company;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private int anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, int anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double calcularAlquiler(){
        if(this.anioFabricacion <= 2020){
            return this.precioBase;
        } else{
            return this.precioBase + this.valorAdicional;
        }
    }

    public void capitanDeEmbarcacion(){
        capitan.consultarCapitan();
    }

}
