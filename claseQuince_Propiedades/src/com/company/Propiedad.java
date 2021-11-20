package com.company;

import java.util.Date;

public abstract class Propiedad {
    private Dueño dueño;
    private Date fechaAdquisicion;
    private Double precioEnUsd;
    private String direccion;
    private boolean estaHipotecada;


    public Propiedad(Dueño dueño, Date fechaAdquisicion, Double precioEnUsd, String direccion, boolean estaHipotecada) {
        this.dueño = dueño;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precioEnUsd = precioEnUsd;
        this.direccion = direccion;
        this.estaHipotecada = estaHipotecada;
    }


    public boolean sePuedeVender(){
        if(!this.estaHipotecada){
            return true;
        } else{
            return false;
        }
    }

}
