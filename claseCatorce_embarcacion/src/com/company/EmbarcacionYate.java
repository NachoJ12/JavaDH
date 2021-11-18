package com.company;

public class EmbarcacionYate extends Embarcacion implements Comparable {
    private int cantidadCamarotes;

    public EmbarcacionYate(Capitan capitan, Double precioBase, Double valorAdicional, int anioFabricacion, Double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
         return this.cantidadCamarotes - ((EmbarcacionYate) o).cantidadCamarotes;

        /*EmbarcacionYate yate = (EmbarcacionYate) o;
        int yate1 = this.cantidadCamarotes;
        int yate2 = yate.cantidadCamarotes;

        return yate1 - yate2;*/
    }
}
