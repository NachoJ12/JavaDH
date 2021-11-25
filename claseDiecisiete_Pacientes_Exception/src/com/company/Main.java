package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente= null;
        try {
            paciente = new Paciente("Juan","Perez","12345",new Date(121,10,25));
        } catch (PacienteException e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }

        try {
            paciente.darAlta(new Date(121, 10, 29));
        } catch (PacienteException e){
            e.printStackTrace();
        };


        Paciente paciente2= null;
        try {
            paciente2 = new Paciente("Roberto","Martinez","78547",new Date(122,10,23));
        } catch (PacienteException e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }





       // System.out.println(paciente.getFechaInternacion());


    }
}
