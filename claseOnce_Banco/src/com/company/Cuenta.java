package com.company;

public abstract class Cuenta {
    private String numero;
    private double saldo;


    public Cuenta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double importe){

    }

    public void extraerEfectivo(double importe){

    }

    public void informarSaldo(){
        System.out.println("El saldo es de: " + saldo);
    }


}
