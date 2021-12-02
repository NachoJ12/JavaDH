package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private StateCarrito estado;
    private List<Producto> productos;

    public Carrito() {
        this.estado = new Vacio();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);
    }

    public void cancelar() {
        this.estado = this.estado.cancelarCarrito();
        System.out.println("El carrito queda cancelado. Su estado es: " + this.estado.getNombre());
    }

    public void regresar() {
        this.estado = this.estado.regresar();
        System.out.println("Ahora el carrito está: " + this.estado.getNombre());
    }

    public void pasarSiguiente() {
        this.estado = this.estado.pasarAlSiguiente();
        System.out.println("Ahora el carrito está: " + this.estado.getNombre());
    }

    public StateCarrito getEstado() {
        return estado;
    }
}

