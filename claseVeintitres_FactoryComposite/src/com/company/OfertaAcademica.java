package com.company;

public abstract class OfertaAcademica implements Ofertable{
    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }


    // Como es abtracta e implementa Ofertable, el método se pasa automatico.
}
