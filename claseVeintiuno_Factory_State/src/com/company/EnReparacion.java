package com.company;

public class Reparacion implements StateReparacion{
    @Override
    public StateReparacion pasarAlSiguiente() {
        return null;
    }

    @Override
    public StateReparacion agregarRepuesto() {
        return null;
    }

    @Override
    public StateReparacion darValorPresupuesto() {
        return null;
    }

    @Override
    public StateReparacion cambiarDireccion() {
        return null;
    }
}
