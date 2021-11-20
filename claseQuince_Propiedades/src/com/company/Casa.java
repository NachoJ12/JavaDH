package com.company;

import java.util.Date;

public class Casa extends Propiedad implements Comparable{
    private int cantidadAmbientes;
    private Double cantidadMetrosCuadrados;

    public Casa(Dueño dueño, Date fechaAdquisicion, Double precioEnUsd, String direccion, boolean estaHipotecada, int cantidadAmbientes, Double cantidadMetrosCuadrados) {
        super(dueño, fechaAdquisicion, precioEnUsd, direccion, estaHipotecada);
        this.cantidadAmbientes = cantidadAmbientes;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {
        return this.cantidadAmbientes - ((Casa) o).cantidadAmbientes;
    }
}
