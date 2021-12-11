package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private Double valorBasico;
    private List<OfertaAcademica> carrera;

    public Carrera(String nombre, String descripcion, Double valorBasico) {
        super(nombre, descripcion);
        this.valorBasico = valorBasico;
        this.carrera = new ArrayList<>();
    }

    public void addOfertable(OfertaAcademica ofertable) throws CarreraException {
        if (ofertable instanceof Curso) {
            if (((Curso) ofertable).getCargaHorariaTotal() < 10) {
                throw new CarreraException("No se puede agregar el curso, ya que la duración del mismo no supera las 10 horas.");
            }
        }
        this.carrera.add(ofertable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = this.valorBasico;
        for (OfertaAcademica ofertable : carrera) {
            precioTotal += ofertable.calcularPrecio();
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return "\n" + "Carrera{" +
                "Nombre=" + this.getNombre() +
                ", Precio=" + this.calcularPrecio() +
                '}';
    }
}
