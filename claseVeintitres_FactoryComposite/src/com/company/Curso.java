package com.company;

public class Curso extends OfertaAcademica{
    private Double valorHora;
    private int cargaHorariaMensual;
    private int duracionMeses;

    public Curso(String nombre, String descripcion, Double valorHora, int cargaHorariaMensual, int duracionMeses) {
        super(nombre, descripcion);
        this.valorHora = valorHora;
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.duracionMeses = duracionMeses;
    }


    @Override
    public String toString() {
        return "\n" + "Curso{" +
                "Nombre=" + this.getNombre() +
                ", Costo=" + this.calcularPrecio() +
                '}';
    }

    @Override
    public Double calcularPrecio() {
        return this.cargaHorariaMensual * duracionMeses * valorHora;
    }

}


