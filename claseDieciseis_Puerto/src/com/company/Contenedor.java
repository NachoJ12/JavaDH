package com.company;

public class Contenedor implements Comparable<Contenedor>{
    private int numero;
    private String paisProcedencia;
    private boolean materialesPeligrosos;


    public Contenedor(int numero, boolean materialesPeligrosos, String paisProcedencia) {
        this.numero = numero;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor o) {
        return this.numero - o.numero;
    }


    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public boolean isMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public void setMaterialesPeligrosos(boolean materialesPeligrosos) {
        this.materialesPeligrosos = materialesPeligrosos;
    }
}
