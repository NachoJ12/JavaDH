package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();

    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica) {
        this.ofertas.add(ofertaAcademica);
    }

    //HAY QUE VER BIEN COMO HACER PARA GENERAR EL INFORME SIN TENER QUE USAR LOS .toString() en Programa y Curso
    public String generarInforme(){
        return "Instituto{" +
                "nombre='" + nombre +
                ", ofertas=" + ofertas +
                '}';
    }



}
