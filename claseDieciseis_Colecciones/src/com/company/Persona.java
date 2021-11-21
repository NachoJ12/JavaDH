package com.company;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas = new ArrayList<>();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombreCompleto(){
        return this.nombre + this.apellido;
    }

    public boolean esMayorEdad(){
        return this.edad > 60;
    }

    /*
    public double getSaldoTotal(){
        // debe traer la suma de todos los saldos de todas las cuentas que posea la persona.
    }*/

    public void mostrarCuentas(){
        // debe mostrar por consulta el saldo de cada cuenta en forma ordenada por número de cuenta.
    }

}
