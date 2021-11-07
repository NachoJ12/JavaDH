package com.company;

public class CajaDeAhorro extends Cuenta{
    private double saldo;
    private double tasaDeInteres;

    public CajaDeAhorro(String numero, double tasaDeInteres) {
        super(numero);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres(){
        double interes = (saldo * tasaDeInteres) / 100;
        System.out.println("El interes es de: " + interes);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
