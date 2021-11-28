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

    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return this.nroCuenta - o.nroCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta=" + nroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
