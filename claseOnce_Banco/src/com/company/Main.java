package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CajaDeAhorro cajaAhorro1 = new CajaDeAhorro("12584A", 30);
        cajaAhorro1.setSaldo(1000.0);
        cajaAhorro1.informarSaldo();
    }
}
