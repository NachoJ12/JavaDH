package com.company;

public class Main {

    public static void main(String[] args) {
        Carrito miPrimerCarrito = new Carrito();

        Producto agua = new Producto("Agua",100.0);
        Producto cafe = new Producto("Cafe",350.0);
        Producto arroz = new Producto("Arroz",450.0);
        Producto alfajor = new Producto("Alfajor",200.0);
        Producto cerveza = new Producto("Cerveza",650.0);

        System.out.println(miPrimerCarrito.getEstado().getNombre());

        miPrimerCarrito.agregarProducto(agua);
        miPrimerCarrito.agregarProducto(cafe);

        //Pasar a cargando
        miPrimerCarrito.pasarSiguiente();

        //Pasar a pagando
        miPrimerCarrito.pasarSiguiente();

        //Cancelar carrito
        miPrimerCarrito.cancelar();



    }
}
