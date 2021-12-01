package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private String nombre;
    private List<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();

        // Productos
        Caja caja = (Caja) ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Pelota pelotaFutbol = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTAFUTBOL");
        Pelota pelotaTenis = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTATENIS");
        //Caja caja2 = (Caja) ProductoFactory.getInstance().crearProducto("CAJA10X20");


        productos.add(caja);
        productos.add(pelotaFutbol);
        productos.add(pelotaTenis);
        //productos.add(caja2);


    }


    public double calcularEspacioNecesario(){
        double espacioTotal = 0.0;
        for (Producto producto: productos){
            espacioTotal += producto.calcularEspacio();
        }
        return espacioTotal;
    }

}
