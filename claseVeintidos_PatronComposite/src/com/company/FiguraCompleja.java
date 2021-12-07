package com.company;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja implements Armables{
    private List<Armables> figuraCompleja;

    public FiguraCompleja(List<Armables> figuraCompleja) {
        this.figuraCompleja = new ArrayList<>();
    }

    @Override
    public Double calcularArea() {
        Double totalArea = 0.0;
        for (Armables armables : figuraCompleja) {
            totalArea += armables.calcularArea();
        }
        return totalArea;
    }
}
