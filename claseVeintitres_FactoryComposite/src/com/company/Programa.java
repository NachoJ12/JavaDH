package com.company;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica{
    private List<Ofertable> programa;
    private Double bonificacion;

    public Programa(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.programa = new ArrayList<>();
        this.bonificacion = bonificacion;
    }

    public void addOfertable(Ofertable ofertable){
        this.programa.add(ofertable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Ofertable ofertable : programa) {
            precioTotal += ofertable.calcularPrecio();
        }
        return precioTotal - (precioTotal * this.bonificacion / 100);
    }

    @Override
    public String toString() {
        return "\n" + "Programa{" +
                "Nombre= " + this.getNombre() +
                ", Costo= " + this.calcularPrecio() +
                '}';
    }
}
