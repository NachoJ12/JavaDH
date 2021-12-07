package com.company;

public class Triangulo extends FiguraSimple{
    private Double base;
    private Double altura;

    public Triangulo(String nombre, Double base, Double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }
}
