package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private String nombre;
    private List<Armables> tren;

    public Tren(String nombre) {
        this.nombre = nombre;
        this.tren = new ArrayList<>();
    }

    public void addTren(Armables armable){
        this.tren.add(armable);
    }

    public Double calcularAreaTren(){
        Double totalAreaTren = 0.0;
        for (Armables armables : tren) {
            totalAreaTren += armables.calcularArea();
        }
        return totalAreaTren;
    }

}
