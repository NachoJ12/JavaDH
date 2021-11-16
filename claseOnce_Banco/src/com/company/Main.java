package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        CajaDeAhorro cajaAhorro1 = new CajaDeAhorro("12584A", 30);
        cajaAhorro1.setSaldo(1000.0);
        cajaAhorro1.informarSaldo();

        System.out.println("\n");
        System.out.println("Cuenta Corriente");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("CC58795237");
        cuentaCorriente1.setSaldo(500);
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.depositarCheque(new Cheque(500, "BBVA"));
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraerEfectivo(500);
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraerEfectivo(700);
        cuentaCorriente1.informarSaldo();
        System.out.println(cuentaCorriente1.getDescubierto());
    }
}
