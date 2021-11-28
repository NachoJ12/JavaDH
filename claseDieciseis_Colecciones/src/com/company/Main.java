package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Roberto","Garcia", 58);
        System.out.println(persona1.getNombreCompleto());
        System.out.println("Roberto García es mayor de edad? "+ persona1.esMayorEdad());

        Cuenta cuenta1 = new Cuenta(persona1, 1586, 1500.0);
        Cuenta cuenta2 = new Cuenta(persona1, 1587, 3500.0);
        Cuenta cuenta3 = new Cuenta(persona1, 157, 2500.0);

        System.out.println(cuenta1.getNroCuenta());
        System.out.println(cuenta1.getSaldo());

        persona1.addCuenta(cuenta1);
        persona1.addCuenta(cuenta2);
        persona1.addCuenta(cuenta3);
        persona1.mostrarCuentas();
        System.out.println(persona1.getSaldoTotal());



    }
}
