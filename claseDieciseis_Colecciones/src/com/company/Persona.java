package com.company;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas = new ArrayList<>();
    }

    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    public boolean esMayorEdad(){
        return this.edad > 60;
    }


    public double getSaldoTotal(){
        // debe traer la suma de todos los saldos de todas las cuentas que posea la persona.
        double sumaTotal = 0;
        for(Cuenta cuenta: cuentas)
            sumaTotal += cuenta.getSaldo();
        return sumaTotal;
    }

    public void mostrarCuentas(){
        // debe mostrar por consulta el saldo de cada cuenta en forma ordenada por número de cuenta.
        cuentas.sort(null);
        for(Cuenta cuenta : cuentas) // Esto es un forEach
            System.out.println(cuenta.toString());
    }


}
