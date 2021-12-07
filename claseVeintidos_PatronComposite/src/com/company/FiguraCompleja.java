package com.company;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja implements Armables{
    private List<Armables> armable;

    public FiguraCompleja() {
        this.armable = new ArrayList<>();
    }

    public void addArmables(Armables figura){this.armable.add(figura);}

    @Override
    public Double calcularArea() {
        Double totalArea = 0.0;
        for (Armables armables : armable) {
            totalArea += armables.calcularArea();
        }
        return totalArea;
    }
}
