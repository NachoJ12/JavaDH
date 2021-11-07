package com.company;

import java.util.Date;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(String numero, double descubierto) {
        super(numero);
        this.descubierto = descubierto;
    }

    /*
    @Override
    public void depositar(double importe) {
       this.saldo += importe;
    } */

    /* pensando como aplicar la funcionalidad del deposito del cheque
    public void depositar (double importe, String banco, Date fecha){
        this.saldo += importe;

    }*/

}
