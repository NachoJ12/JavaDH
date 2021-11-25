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


    public void mostrarContenedoresPorNumero(){
        contenedores.sort(null);
        for (Contenedor contenedor: contenedores){
            System.out.println(contenedor.getNumero());
        }
    }

    public int getCantidadContenedoresPeligrososProcedenciaDesconocida(){
        int cantidadContenedores = 0;
        for(Contenedor contenedor: contenedores){
            if(contenedor.isMaterialesPeligrosos() == true && contenedor.getPaisProcedencia() == "Desconocida"){
                cantidadContenedores++;
            }
        }
        return cantidadContenedores;
    }


}
