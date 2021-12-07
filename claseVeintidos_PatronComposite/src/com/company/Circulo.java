package com.company;

public class Circulo extends FiguraSimple{
    private Double radio;

    public Circulo(String nombre, Double radio) {
        super(nombre);
        this.radio = radio;
    }


    @Override
    public Double calcularArea() {
        return radio * radio * Math.PI;
    }
}
