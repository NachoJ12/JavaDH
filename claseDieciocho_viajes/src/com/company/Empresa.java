package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Reserva> reservas;
    // Deberia agregar una Lista de estaciones para hacerlo más escalable

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public void addReserva(Reserva e){
        reservas.add(e);
    }

    public double recaudacionTotal(){
        double recaudacion = 0;
        for (Reserva reserva: reservas){
            recaudacion += reserva.getPrecio();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(String estacion) throws EmpresaException{
        int cantidad = 0;
        if (estacion == "Buenos Aires" || estacion == "Luján" || estacion == "Mercedes" || estacion == "Suipacha" || estacion == "Chivilcoy" || estacion == "Alberti" || estacion == "Bragado") {
            for (Reserva reserva : reservas) {
                if (reserva.getEstacionOrigen().equals(estacion) || reserva.getEstacionDestino().equals(estacion))
                    cantidad += reserva.getCantViajeros();
            }
            return cantidad;
        } else {
            throw new EmpresaException("La estación ingresada (" + estacion + ") no corresponde con las existentes");
        }
    }

}
