package com.company;

public class Taller extends OfertaAcademica{
    private int cantidadTrabajosPracticos;
    private Double valorTrabajoPractico;

    public Taller(String nombre, String descripcion, int cantidadTrabajosPracticos, Double valorTrabajoPractico) {
        super(nombre, descripcion);
        this.cantidadTrabajosPracticos = cantidadTrabajosPracticos;
        this.valorTrabajoPractico = valorTrabajoPractico;
    }

    @Override
    public Double calcularPrecio() {
        return this.cantidadTrabajosPracticos * this.valorTrabajoPractico;
    }

    @Override
    public String toString() {
        return "\n" + "Taller{" +
                "Nombre=" + this.getNombre() +
                ", precio=" + this.calcularPrecio() +
                '}';
    }
}
