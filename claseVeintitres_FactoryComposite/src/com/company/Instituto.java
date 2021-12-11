package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();

    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica) {
        this.ofertas.add(ofertaAcademica);
    }

    public void generarInforme(){
        for(OfertaAcademica oferta : ofertas)
            System.out.println(oferta.getNombre() + ", precio: " + oferta.calcularPrecio());
    }



}
