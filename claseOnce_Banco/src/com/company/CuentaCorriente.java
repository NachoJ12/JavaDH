package com.company;

import java.util.Date;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(String numero) {
        super(numero);
        this.descubierto = 0.0;
    }


    public void depositarCheque(Cheque cheque) {
        setSaldo(getSaldo() + cheque.getMonto());
    }

    @Override
    public void extraerEfectivo(double importe) {
        if (importe <= getSaldo()){
            setSaldo(getSaldo()-importe);
        } else {
            double importeExtra = getSaldo() - importe;
            setSaldo(0.0);
            this.descubierto += importeExtra;
        }
    }


    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}
