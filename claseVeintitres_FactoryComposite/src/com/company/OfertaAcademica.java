package com.company;

public abstract class OfertaAcademica{
    private String nombre;
    private String descripcion;


    //HACER SIN CONSTRUCTOR, CODIGO MAS LIMPIO
    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double calcularPrecio();

}
