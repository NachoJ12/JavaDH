package com.company;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matricula;
    }

    public void consultarCapitan(){
        System.out.println("El capitan es: " + nombre + " " + apellido +". Matricula: " + matriculaNavegacion);
    }

}
