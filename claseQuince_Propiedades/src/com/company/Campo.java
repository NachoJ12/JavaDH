package com.company;

import java.util.Date;

public class Campo extends Propiedad{
    private boolean tieneCasco;
    private Double cantidadHectareas;

    public Campo(Dueño dueño, Date fechaAdquisicion, Double precioEnUsd, String direccion, boolean estaHipotecada, boolean tieneCasco, Double cantidadHectareas) {
        super(dueño, fechaAdquisicion, precioEnUsd, direccion, estaHipotecada);
        this.tieneCasco = tieneCasco;
        this.cantidadHectareas = cantidadHectareas;
    }

    public boolean aptoCultivo(){
        if(this.cantidadHectareas > 10){
            return true;
        } else {
            return false;
        }
    }

}
