package com.company;

public class Cuenta implements Comparable<Cuenta> {
    private Persona persona;
    private int nroCuenta;
    private double saldo;


    public Cuenta(Persona persona, int nroCuenta, double saldo) {
        this.persona = persona;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return this.nroCuenta - o.nroCuenta;
    }
}
