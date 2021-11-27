package com.company;

public class Reserva {
    private String codigo;
    private int cantViajeros;
    private String estacionOrigen;
    private String estacionDestino;

    public Reserva(String codigo, int cantViajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        this.cantViajeros = cantViajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }


    public double getPrecio(){
        double precioBase = this.cantViajeros * 50;
        double precioConDescuento = precioBase * .8;
        if (fueCompleto()){
            return precioConDescuento;
        } else {
            return precioBase;
        }
    }

    private boolean fueCompleto(){
        if(estacionOrigen == "Buenos Aires" && estacionDestino == "Bragado" || estacionOrigen == "Bragado" && estacionDestino == "Buenos Aires" ){
            return true;
        } else {
            return false;
        }
    }

    public int getCantViajeros() {
        return cantViajeros;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
