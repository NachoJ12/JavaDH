package com.company;

import java.util.List;

public class ReparacionArticulo {
    private StateReparacion estado;
    private String nombreArticulo;
    //private List<Repuesto> repuestos;
    private double valorPresupuesto;
    private String direccionEntrega;

    public ReparacionArticulo(StateReparacion estado, String nombreArticulo) {
        this.estado = estado;
        this.nombreArticulo = nombreArticulo;
    }



    public void cambiarDireccion(String direccion){

    }

    public void darValorPresupuesto(double valor){

    }

    public void agregarRepuestos(){

    }

    public void siguienteEstado(){

    }




}
