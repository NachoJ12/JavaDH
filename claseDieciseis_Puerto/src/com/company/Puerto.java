package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;


    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }


    public void addContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

        /*
    public void mostrarContenedoresPorNumero(){


    }*/

    /*
    public int getCantidadContenedoresPeligrosos(){
        int cantidadContenedores = 0;
        for(Contenedor contenedor: contenedores){
            if(contenedores.materialesPeligrosos == true && contenedores.getPaisProcedencia() == "Desconocido"){
                cantidadContenedores++;
            }
        }
        return cantidadContenedores;
    }*/


}
