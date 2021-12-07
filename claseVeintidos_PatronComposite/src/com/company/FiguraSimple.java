package com.company;

public abstract class FiguraSimple implements Armables{
    private String nombre;

    public FiguraSimple(String nombre) {
        this.nombre = nombre;
    }

    public abstract Double calcularArea();
}
